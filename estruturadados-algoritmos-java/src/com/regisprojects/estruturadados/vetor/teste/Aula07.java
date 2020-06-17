/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.vetor.teste;

import com.regisprojects.estruturadados.vetor.Vetor;

/**
 *
 * @author user
 */
public class Aula07 {
    
    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(10);
        
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");
        
        System.out.println(vetor);
        
        vetor.adiciona(0, "A");
        
        System.out.println(vetor);
        
        vetor.adiciona(3, "D");
        
        System.out.println(vetor);
        
    }
    
}
