/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webflux.webflux;

import com.webflux.webflux.document.Playlist;
import com.webflux.webflux.repository.PlaylistRepository;
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
//    DummyData(PlaylistRepository playlistRepository) {
//        this.playlistRepository = playlistRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        
//        playlistRepository.deleteAll()
//                .thenMany(
//                        Flux.just("API REST Spring Boot", "Bean no Spring Framework","Depoy de uma aplicação Java no IBM Cloud", "Java 8", "Github", "Spring Security")
//                                  .map(nome -> new Playlist(UUID.randomUUID().toString(), nome))
//                                  .flatMap(playlistRepository::save))
//                .subscribe(System.out::println);
//    }
//    
//}
