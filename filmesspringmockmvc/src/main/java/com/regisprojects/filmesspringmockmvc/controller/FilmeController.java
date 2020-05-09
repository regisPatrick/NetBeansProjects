/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.filmesspringmockmvc.controller;

import com.regisprojects.filmesspringmockmvc.model.Filme;
import com.regisprojects.filmesspringmockmvc.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping("/filmes")
public class FilmeController {
    
    @Autowired
    private FilmeService filmeService;
    
    @GetMapping("/{codigo}")
    public ResponseEntity<Filme> obterFilme(@PathVariable Long codigo){
        
        Filme filme = this.filmeService.obterFilme(codigo);
        
        if(filme == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(filme);
    }
}
