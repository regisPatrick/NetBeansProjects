/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.thread.aula71;

/**
 *
 * @author user
 */
public class Teste {
    
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5};
        
        MinhaThreadSoma t1 = new MinhaThreadSoma("#1", array);
        MinhaThreadSoma t2 = new MinhaThreadSoma("#2", array);
        
    }
    
}
