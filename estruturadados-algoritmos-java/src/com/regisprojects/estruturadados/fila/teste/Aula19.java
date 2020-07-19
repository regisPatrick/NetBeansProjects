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
public class Aula19 {
    
    public static void main(String[] args) {
        
        Fila<Integer> fila = new Fila<>();
        
        System.out.println(fila.estaVazia()); // true
        System.out.println(fila.tamanho()); // 0
        
    }
    
}
