/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author user
 */
public class Aula23 {

    public static void main(String[] args) {
        
        Queue<Integer> fila = new LinkedList<>();
        
        fila.add(1); // enqueue
        fila.add(2);
        
        System.out.println(fila);
        
        System.out.println(fila.peek()); // espiar
        
        System.out.println(fila.remove()); // desenfileirar - dequeue
        
        System.out.println(fila);
        
    }
    
}
