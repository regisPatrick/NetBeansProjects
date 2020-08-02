/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springwebfluxapi.controller;

import com.regisprojects.springwebfluxapi.document.Playlist;
import com.regisprojects.springwebfluxapi.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author user
 */
@RestController
public class PlaylistController {
    
    @Autowired
    PlaylistService service;
    
    @GetMapping(value = "/playlist")
    public Flux<Playlist> getPlaylist(){
        return service.findAll();
    }
    
    @GetMapping(value = "/playlist/{id}")
    public Mono<Playlist>getPlaylistId(@PathVariable String id){
        return service.findById(id);
    }
    
    @PostMapping(value = "/playlist")
    public Mono<Playlist> save(@RequestBody Playlist playlist){
        return service.save(playlist);
    }
    
}
