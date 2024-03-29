/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.webfluxspringboot.controller;

import com.apirest.webfluxspringboot.document.Playlist;
import com.apirest.webfluxspringboot.services.PlaylistService;
import java.time.Duration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

/**
 *
 * @author user
 */
@RestController
public class PlaylistController {
    
    @Autowired
    PlaylistService service;
    
    @GetMapping(value="/playlist")
    public Flux<Playlist> getPlaylist(){
        return service.findAll();
    }
    
    @GetMapping(value="/playlist/{id}")
    public Mono<Playlist> getPlaylistId(@PathVariable String id){
        return service.findById(id);
    }
    
    @PostMapping(value="/playlist")
    public Mono<Playlist> save(@RequestBody Playlist playlist){
        return service.save(playlist);
    }
    
    @GetMapping(value="/playlist/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Tuple2<Long, Playlist>> getPlaylistByEvents(){
        
        Flux<Long> interval = Flux.interval(Duration.ofSeconds(10));
        Flux<Playlist> events = service.findAll();
        System.out.println("Passou aqui events");
        return Flux.zip(interval, events);
    }
    
}
