/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springboot2.controller;


import com.regisprojects.springboot2.domain.Anime;
import com.regisprojects.springboot2.service.AnimeService;
import com.regisprojects.springboot2.util.DateUtil;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {
   
    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return animeService.listAll();
    }
    
}
