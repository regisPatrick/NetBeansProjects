/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springboot2.repository;

import com.regisprojects.springboot2.domain.Anime;
import java.util.List;

/**
 *
 * @author user
 */
public interface AnimeRepository {
    
    List<Anime> listAll();
    
}
