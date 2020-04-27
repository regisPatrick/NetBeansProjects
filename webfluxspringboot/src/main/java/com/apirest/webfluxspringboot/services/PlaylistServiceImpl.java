/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.webfluxspringboot.services;

import com.apirest.webfluxspringboot.document.Playlist;
import com.apirest.webfluxspringboot.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author user
 */
@Service
public class PlaylistServiceImpl implements PlaylistService{
    
    @Autowired
    PlaylistRepository pr;

    @Override
    public Flux<Playlist> findAll() {
        return pr.findAll();
    }

    @Override
    public Mono<Playlist> findById(String id) {
        return pr.findById(id);
    }

    @Override
    public Mono<Playlist> save(Playlist playlist) {
        return pr.save(playlist);
    }
    
}
