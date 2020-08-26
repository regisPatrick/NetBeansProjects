/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springwebfluxessentials.service;

import com.regisprojects.springwebfluxessentials.domain.Anime;
import com.regisprojects.springwebfluxessentials.repository.AnimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

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
    
}
