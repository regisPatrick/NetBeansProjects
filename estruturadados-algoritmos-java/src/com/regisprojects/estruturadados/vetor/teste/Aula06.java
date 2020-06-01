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
public class Aula06 {

    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1"); // 0
        vetor.adiciona("elemento 2"); // 1
        vetor.adiciona("elemento 3"); // 2
        
        System.out.println(vetor.busca("elemento 1"));
        System.out.println(vetor.busca("elemento 4"));
        
    }
    
}
