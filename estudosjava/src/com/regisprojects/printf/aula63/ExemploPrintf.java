/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.printf.aula63;

/**
 *
 * @author user
 */
public class ExemploPrintf {
    
    public static void main(String[] args) {
        
        System.out.printf("%s", "Olá, Mundo!");
        System.out.println();
        System.out.printf("%S", "Olá, Mundo!");
        System.out.println();
        
        System.out.printf("%c", 'c');
        System.out.println();
        System.out.printf("%C", 'c');
        System.out.printf("%n");
        
        int valor = 123456789;
        System.out.printf("%d", valor);
        
        System.out.println();
        
        double pontoFlutuante = 3.1456789;
        System.out.printf("%f", pontoFlutuante);
        
        System.out.println();
        
        String olaMundo = "Olá, Mundo!";
        System.out.printf("%20s", olaMundo);
        
        System.out.println();
        System.out.printf("%-20s", olaMundo);
        
        System.out.println();
        System.out.printf("%+d", valor);
    }
    
}   
