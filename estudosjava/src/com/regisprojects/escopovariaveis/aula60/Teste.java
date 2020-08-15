/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.escopovariaveis.aula60;

/**
 *
 * @author user
 */
public class Teste {
    
    public static void main(String[] args) {
        
        EscopoVariaveis escopo = new EscopoVariaveis();
        escopo.setValor(10);
        
        System.out.println(escopo.getValor()); // 10
        
        System.out.println(escopo.calculaValor(20)); // 30
        
        System.out.println(escopo.getValor()); // 10
        
        System.out.println(escopo.teste()); // 4 
        
        System.out.println(escopo.getValor()); // 10
        
    }
    
}
