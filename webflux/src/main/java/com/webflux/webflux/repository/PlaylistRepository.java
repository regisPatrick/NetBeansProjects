/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webflux.webflux.repository;

import com.webflux.webflux.document.Playlist;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 *
 * @author user
 */
public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String>{
    
}
