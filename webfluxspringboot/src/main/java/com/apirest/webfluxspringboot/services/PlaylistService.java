/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.webfluxspringboot.services;

import com.apirest.webfluxspringboot.document.Playlist;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author user
 */
public interface PlaylistService {
    
    Flux<Playlist> findAll();
    
    Mono<Playlist> findById(String id);
    
    Mono<Playlist> save(Playlist playlist);
    
}
