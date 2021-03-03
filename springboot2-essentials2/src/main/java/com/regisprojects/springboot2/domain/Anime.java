/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author user
 */
@Data
@AllArgsConstructor
public class Anime {
    
    private Long id;
    
    private String name;

//    public Anime(String name) {
//        this.name = name;
//    }
//
//    public Anime() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    
}
