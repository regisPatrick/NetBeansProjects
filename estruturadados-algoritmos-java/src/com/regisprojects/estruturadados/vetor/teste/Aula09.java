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
public class Aula09 {
    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(3);
        
        vetor.adiciona("B");
        vetor.adiciona("G");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");
        
        System.out.println(vetor);
        
        vetor.remove(1);
        
        System.out.println(vetor);
        
        System.out.println("Remover o elemento A");
        
        int pos = vetor.busca("A");
        if(pos > -1){
            vetor.remove(pos);
        } else {
            System.out.println("Elemento não existe no vetor");
        }
        
        System.out.println(vetor);
        
    }
}
