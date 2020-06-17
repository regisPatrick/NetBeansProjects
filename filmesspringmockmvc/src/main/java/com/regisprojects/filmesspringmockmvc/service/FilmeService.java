/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.filmesspringmockmvc.service;

import com.regisprojects.filmesspringmockmvc.model.Filme;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class FilmeService {
    
    public Filme obterFilme(Long codigo){
        
        if(codigo > 100){
            return null;
        }
        return new Filme(
                codigo,
                "O Poderoso Chefão",
                "Filme norte-americano de 1972, dirigido por Francis Ford Coppola"
        );
    }
}
