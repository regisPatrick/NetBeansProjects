/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springwebfluxessentials.service;

import com.regisprojects.springwebfluxessentials.domain.Anime;
import com.regisprojects.springwebfluxessentials.repository.AnimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author user
 */
@Service
@RequiredArgsConstructor
public class AnimeService {

    private final AnimeRepository animeRepository;
    
    public Flux<Anime> findAll() {
        return animeRepository.findAll();
    }
    
//    public Mono<Anime> findById(int id){
//        return animeRepository.findById(id)
//                .switchIfEmpty(Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND, "Anime not found")))
//                .log();
//    }
    
    public Mono<Anime> findById(int id){
        return animeRepository.findById(id)
                .switchIfEmpty(monoResponseStatusNotFoundException());
//                .log();
    }
    
    public <T> Mono<T> monoResponseStatusNotFoundException(){
        return Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND, "Anime not found"));
    }

    public Mono<Anime> save(Anime anime) {
        return animeRepository.save(anime);
    }
    
    public Mono<Void> update(Anime anime){
        return findById(anime.getId())
                .flatMap(validAnime -> animeRepository.save(anime))
                .then();
    }

    public Mono<Void> delete(int id) {
        return findById(id)
                .flatMap(animeRepository::delete);
    }
    
}
