/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springwebfluxessentials.controller;

import com.regisprojects.springwebfluxessentials.domain.Anime;
import com.regisprojects.springwebfluxessentials.repository.AnimeRepository;
import com.regisprojects.springwebfluxessentials.service.AnimeService;
import com.regisprojects.springwebfluxessentials.util.AnimeCreator;
import java.util.List;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.server.ResponseStatusException;
import reactor.blockhound.BlockHound;
import reactor.blockhound.BlockingOperationError;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import reactor.test.StepVerifier;

/**
 *
 * @author user
 */
@ExtendWith(SpringExtension.class)
public class AnimeControllerTest {
    
    @InjectMocks
    private AnimeController animeController;
    
    @Mock
    private AnimeService animeServiceMock;
    
    private final Anime anime = AnimeCreator.createValidAnime();
    
    @BeforeAll
    public static void blockHoundSetup(){
        BlockHound.install();
    }
    
    @BeforeEach
    public void setup(){
        BDDMockito.when(animeServiceMock.findAll())
                .thenReturn(Flux.just(anime));
        
        BDDMockito.when(animeServiceMock.findById(ArgumentMatchers.anyInt()))
                .thenReturn(Mono.just(anime));
        
        BDDMockito.when(animeServiceMock.save(AnimeCreator.createAnimeToBeSaved()))
                .thenReturn(Mono.just(anime));
        
        BDDMockito.when(animeServiceMock
                .saveAll(List.of(AnimeCreator.createAnimeToBeSaved(), AnimeCreator.createAnimeToBeSaved())))
                .thenReturn(Flux.just(anime, anime));
        
        BDDMockito.when(animeServiceMock.delete(ArgumentMatchers.anyInt()))
                .thenReturn(Mono.empty());
        
        BDDMockito.when(animeServiceMock.update(AnimeCreator.createValidAnime()))
                .thenReturn(Mono.empty());
    }
    
    @Test
    public void blockHoundWorks() {
        try {
            FutureTask<?> task = new FutureTask<>(() -> {
                Thread.sleep(0);
                return "";
            });
            Schedulers.parallel().schedule(task);

            task.get(10, TimeUnit.SECONDS);
            Assertions.fail("should fail");                     
        } catch (Exception e) {
            Assertions.assertTrue(e.getCause() instanceof BlockingOperationError);
        }
    }
    
    @Test
    @DisplayName("findAll returns a flux of anime")
    public void listAll_ReturnFluxOfAnime_WhenSuccessful(){
        StepVerifier.create(animeController.listAll())
                .expectSubscription()
                .expectNext(anime)
                .verifyComplete();
    }
    
    @Test
    @DisplayName("findById returns Mono with anime when it exists")
    public void findById_ReturnMonoAnime_WhenSuccessful(){
        StepVerifier.create(animeController.findById(10))
                .expectSubscription()
                .expectNext(anime)
                .verifyComplete();
    }
    
    @Test
    @DisplayName("save creates an anime when successful")
    public void save_CreatesAnime_WhenSuccessful(){
        Anime animeToBeSaved = AnimeCreator.createAnimeToBeSaved();
        StepVerifier.create(animeController.save(animeToBeSaved))
                .expectSubscription()
                .expectNext(anime)
                .verifyComplete();
    }
    
    @Test
    @DisplayName("saveBatch creates a list of anime when successful")
    public void saveBatch_CreatesListOfAnime_WhenSuccessful(){
        Anime animeToBeSaved = AnimeCreator.createAnimeToBeSaved();
        StepVerifier.create(animeController.saveBatch(List.of(animeToBeSaved, animeToBeSaved)))
                .expectSubscription()
                .expectNext(anime, anime)
                .verifyComplete();
    }
    
    @Test
    @DisplayName("delete removes the anime when successful")
    public void delete_RemovesAnime_WhenSuccessful(){
        
        StepVerifier.create(animeController.delete(10))
                .expectSubscription()
                .verifyComplete();
    }
    
    @Test
    @DisplayName("update save updated anime and returns empty mono when successful")
    public void update_SaveUpdatedAnime_WhenSuccessful(){
        
        StepVerifier.create(animeController.update(10, AnimeCreator.createValidAnime()))
                .expectSubscription()
                .verifyComplete();
    }
    
}
