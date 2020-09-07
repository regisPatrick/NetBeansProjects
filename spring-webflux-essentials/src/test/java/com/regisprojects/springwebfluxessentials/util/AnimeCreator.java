/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springwebfluxessentials.util;

import com.regisprojects.springwebfluxessentials.domain.Anime;

/**
 *
 * @author user
 */
public class AnimeCreator {
    
    public static Anime createAnimeToBeSaved(){
        return Anime.builder()
                .name("Cavaleiros do Zodiaco")
                .build();
    }
    
    public static Anime createValidAnime(){
        return Anime.builder()
                .id(10)
                .name("Cavaleiros do Zodiaco")
                .build();
    }
    
    public static Anime createValidUpdatedAnime(){
        return Anime.builder()
                .id(10)
                .name("Cavaleiros do Zodiaco - The Lost Canvas")
                .build();
    }
    
}
