/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.pilha.labs;

import com.regisprojects.estruturadados.pilha.Pilha;

/**
 *
 * @author user
 */
public class Exer05 {
    
    public static void main(String[] args) {
        
        imprimeResultado("ADA");
        imprimeResultado("ABCD");
        imprimeResultado("ABCCBA");
        imprimeResultado("Maria");
        
    }
    
    public static void imprimeResultado(String palavra){
        System.out.println(palavra + " é palíndromo? " + testaPalindromo(palavra));
    }
    
    public static boolean testaPalindromo(String palavra){
        
        Pilha<Character> pilha = new Pilha<>();
        
        for (int i = 0; i < palavra.length(); i++){
            pilha.empilha(palavra.charAt(i));
        }
        
        String palavraInversa = "";
        
        while(!pilha.estaVazia()){
            palavraInversa += pilha.desempilha();
        }
        
        if(palavraInversa.equalsIgnoreCase(palavra)){
            return true;
        }
        
        return false;
    }
    
}
