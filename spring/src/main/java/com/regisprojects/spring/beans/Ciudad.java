/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.spring.beans;

/**
 *
 * @author user
 */
public class Ciudad {
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private void init(){
        System.out.println("Antes de inicializar el bean");
    }
    
    private void destroy(){
        System.out.println("Bean a punto de ser destruido");
    }
    
}
