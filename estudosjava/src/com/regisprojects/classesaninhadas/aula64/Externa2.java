/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.classesaninhadas.aula64;

/**
 *
 * @author user
 */
public class Externa2 {

    public void metodoQualquer(){
        
        class classeLocal {
            
            private String texto = "texto classe local";
            
            public void imprimeTexto(){
                System.out.println(texto);
            }
        }
        classeLocal local = new classeLocal();
        
        local.imprimeTexto();
    }
    
    public static void main(String[] args) {
        
        Externa2 externa = new Externa2();
        
        externa.metodoQualquer();
        
    }
    
}
