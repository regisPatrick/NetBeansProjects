/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.pilha.teste;

import com.regisprojects.estruturadados.pilha.Pilha;
import java.util.Stack;

/**
 *
 * @author user
 */
public class Aula18 {
    
    public static void main(String[] args) {
        
        Pilha<Integer> pilha = new Pilha<>();
        
        Stack<Integer> stack = new Stack<>();
        
        System.out.println(stack.isEmpty());
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack);
        
        System.out.println(stack.peek());
        
        System.out.println(stack.pop());
        
        System.out.println(stack);
        
    }
    
}
