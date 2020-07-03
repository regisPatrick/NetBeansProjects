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
public class Aula15 {
    
    public static void main(String[] args) {
    
        Pilha<Integer> pilha = new Pilha<>();
        
        System.out.println(pilha.estaVazia());
        
        pilha.empilha(1);
        
        System.out.println(pilha.estaVazia());
        
    }
    
}
