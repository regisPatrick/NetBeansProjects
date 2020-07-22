/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.fila.teste;

import com.regisprojects.estruturadados.fila.Fila;

/**
 *
 * @author user
 */
public class Aula21 {
    
    public static void main(String[] args) {
        
        Fila<Integer> fila = new Fila<>();
        
        fila.enfileira(3);
        fila.enfileira(1);
        fila.enfileira(2);
        
        System.out.println(fila.espiar());
        
        System.out.println(fila.toString());
        
    }
    
}
