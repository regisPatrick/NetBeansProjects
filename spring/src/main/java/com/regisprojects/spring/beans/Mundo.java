/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.spring.beans;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author user
 */
public class Mundo {
    
    @Value("Hola Mundo!")
    private String saludo;

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    
}
