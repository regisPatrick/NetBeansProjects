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
public class Exer01 {
    
    public static void main(String[] args) {
        
        Pilha<Integer> pilha = new Pilha<>();
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Entre com um número: ");
            int num = scan.nextInt();
            
            if(num % 2 == 0){
                System.out.println("Empilhando o número " + num);
                pilha.empilha(num);
            } else {
                Integer desempilhado = pilha.desempilha();
                
                if(desempilhado == null){
                    System.out.println("Pilha está vázia");
                } else {
                    System.out.println("Número ímpar, desempilhando um elemento da pilha: " + desempilhado);
                }   
            }    
        }
        
        System.out.println("Todos os números foram lidos, desempilhando números da pilha");
        
        while(!pilha.estaVazia()){
            
            System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
            
        }
        
        System.out.println("Todos os elementos foram desempilhados");
        
    }
    
}
