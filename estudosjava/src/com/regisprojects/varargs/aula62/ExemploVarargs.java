/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.varargs.aula62;

/**
 *
 * @author user
 */
public class ExemploVarargs {
    
    public static void main(String[] args) {
        
        System.out.println(soma(1, 2));
        System.out.println(soma(1, 2, 3));
        
        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println(soma(vetor));
        
        System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        
    }
    
    static int soma(int a, int b){
        return a + b;
    }
    
    static int soma(int a, int b, int c){
        return a + b + c;
    }
    
    static int soma(int[] vetor){
        
        int total = 0;
        
        for (int i = 0; i < vetor.length; i++){
            total += vetor[i];
        }
        
        return total;
    }
    
    static int soma(int a, int b, Integer... vetor){
        
        int total = 0;
        
        for (int i = 0; i < vetor.length; i++){
            total += vetor[i];
        }
        
        return total;
    }
    
}
