/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springboot2.essentials.controller;

import com.regisprojects.springboot2.essentials.domain.Anime;
import com.regisprojects.springboot2.essentials.util.DateUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping("anime")
public class AnimeController {
    
    @Autowired
    private DateUtil dateUtil;
    
    @GetMapping(path = "list")
    public List<Anime> list(){
        return List.of(new Anime("DBZ"), new Anime("Berserk"));
    }
    
}
