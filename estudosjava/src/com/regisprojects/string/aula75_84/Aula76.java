/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.string.aula75_84;

/**
 *
 * @author user
 */
public class Aula76 {
    
    public static void main(String[] args) {
        
        String curso = "Curso ";
        String java = "Java";
        
        String cursoJava = curso + java;
        
        System.out.println(cursoJava);
        
        String resultado2com2 = "Resultado 2+2 = " + (2 + 2);
        System.out.println(resultado2com2);
        
        String resultado2com2_ = "Resultado 2+2 = " + 2 + 2;
        System.out.println(resultado2com2_);
        
        String um = String.valueOf(1);
        System.out.println(um);
        
        String concatenacao = "loren loren loren loren loren loren loren loren loren loren loren loren " +
                "loren loren loren loren loren loren loren loren loren loren loren loren " +
                "loren loren loren loren loren loren loren loren loren loren loren loren " +
                "loren loren loren loren loren loren loren loren loren loren loren loren.";
        System.out.println(concatenacao);
        
        String concatenacao2 = "loren loren loren loren loren loren loren loren loren loren loren loren ";
        concatenacao2 += "loren loren loren loren loren loren loren loren loren loren loren loren.";
        System.out.println(concatenacao2);
    
    }
    
}
