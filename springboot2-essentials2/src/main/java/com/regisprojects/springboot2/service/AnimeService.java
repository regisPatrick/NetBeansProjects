/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springboot2.service;

import com.regisprojects.springboot2.domain.Anime;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class AnimeService {
    
    //private final AnimeRepository animeRepository;
    
    public List<Anime> listAll(){
        return  List.of(new Anime(1L, "Boku no Hero"), new Anime(2L, "Berserk"));
    }
    
}
