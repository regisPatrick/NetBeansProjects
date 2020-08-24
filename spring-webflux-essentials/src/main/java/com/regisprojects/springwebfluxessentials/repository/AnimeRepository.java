/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springwebfluxessentials.repository;

import com.regisprojects.springwebfluxessentials.domain.Anime;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 *
 * @author user
 */
public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer> {
    
}
