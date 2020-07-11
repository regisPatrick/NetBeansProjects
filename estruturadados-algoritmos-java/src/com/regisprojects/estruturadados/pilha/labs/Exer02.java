/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.pilha.labs;

import com.regisprojects.estruturadados.pilha.Pilha;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exer02 {
    
    public static void main(String[] args) {
        
        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 1; i <= 10; i++){
            
            System.out.println("Entre com um número: ");
            
            int num = scan.nextInt();
            
            if(num == 0){
                
                // Pilha par
                
                Integer desempilhando = par.desempilha();
                
                if (desempilhando == null){
                    System.out.println("Pilha par vazia");
                } else {
                    System.out.println("Desempilhando da pilha par: " + desempilhando);
                }
                
                // Pilha impar
                
                desempilhando = impar.desempilha();
                
                if (desempilhando == null){
                    System.out.println("Pilha impar vazia");
                } else {
                    System.out.println("Desempilhando da pilha impar: " + desempilhando);
                }
                
            } else if(num % 2 == 0){
                System.out.println("Número par, empilhando na pilha par: " + num);
                par.empilha(num);
            } else {
                System.out.println("Número impar, empilhando na pilha impar: " + num);
                impar.empilha(num);
            }
            
        }
        
        System.out.println("Desmpilhando todos os números da pilha par");
        
        while(!par.estaVazia()){
            System.out.println("Desempilhando da pilha par: " + par.desempilha());
        }
        
        System.out.println("Desmpilhando todos os números da pilha impar");
        
        while(!impar.estaVazia()){
            System.out.println("Desempilhando da pilha impar: " + impar.desempilha());
        }
        
    }
    
}
