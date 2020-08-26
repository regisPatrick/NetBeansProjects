/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springwebfluxessentials.controller;

import com.regisprojects.springwebfluxessentials.domain.Anime;
import com.regisprojects.springwebfluxessentials.repository.AnimeRepository;
import com.regisprojects.springwebfluxessentials.service.AnimeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 *
 * @author user
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("animes")
@Slf4j
public class AnimeController {
    
    private final AnimeService animeService;
    
    @GetMapping
    public Flux<Anime> listAll(){
        return animeService.findAll();
    }
    
}
