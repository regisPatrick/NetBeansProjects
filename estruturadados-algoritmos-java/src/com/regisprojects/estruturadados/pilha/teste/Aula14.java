/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.pilha.teste;

import com.regisprojects.estruturadados.pilha.Pilha;

/**
 *
 * @author user
 */
public class Aula14 {
    
    public static void main(String[] args) {
        
        Pilha<Integer> pilha = new Pilha<>();
        
        for(int i =1; i <= 11; i++){
            pilha.empilha(i);
        }
        
        System.out.println(pilha);
        System.out.println(pilha.tamanho());
        
    }
}
