/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springboot2.service;

import com.regisprojects.springboot2.domain.Anime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author user
 */
@Service
public class AnimeService {
    
    private static List<Anime> animes;
    
    static{
        animes = new ArrayList<>(List.of(new Anime(1L, "Boku no Hero"), new Anime(2L, "Berserk")));
    }
    //private final AnimeRepository animeRepository;
    
    public List<Anime> listAll(){
        return animes;
    }
    
    public Anime findById(long id){
        return animes.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));
    }

    public Anime save(Anime anime) {
        anime.setId(ThreadLocalRandom.current().nextLong(3, 1000000));
        animes.add(anime);
        return anime;
    }

    public void delete(long id) {
        animes.remove(findById(id));
    }
    
}
