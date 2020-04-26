/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.webfluxspringboot;

import com.apirest.webfluxspringboot.document.Playlist;
import com.apirest.webfluxspringboot.repository.PlaylistRepository;
import java.util.UUID;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

/**
 *
 * @author user
 */
//@Component
//public class DummyData implements CommandLineRunner{
//
//    private final PlaylistRepository playlistRepository;
//    
//    DummyData(PlaylistRepository playlistRepository){
//        this.playlistRepository = playlistRepository;
//    }
//    
//    @Override
//    public void run(String... args) throws Exception {
//        
//        playlistRepository.deleteAll()
//                .thenMany(
//                        Flux.just("API REST Spring Boot", "Deploy de uma aplicação java no IBM Cloud",
//                                "Java 8", "GitHub", "Spring Security", "Web Service RestFULL",
//                                "Bean no Spring Framework")
//                                .map(nome -> new Playlist(UUID.randomUUID().toString(), nome))
//                                .flatMap(playlistRepository::save))
//                        .subscribe(System.out::println);
//    }
//    
//}
