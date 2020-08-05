/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.fila.labs;

import com.regisprojects.estruturadados.fila.Fila;
import java.util.Random;

/**
 *
 * @author user
 */
public class Exer04 {
    
    public static void main(String[] args) {
        
        Fila<Integer> fila = new Fila<>();
        
        for (int i = 0; i < 10; i++){
            fila.enfileira(i);
        }
        
        Random aleatorio = new Random();
        int num = 0;
        while(num == 0){
            num = aleatorio.nextInt(10);
        }
        
        System.out.println("Número = " + num);
        
        while(fila.tamanho() > 1){
            for (int i = 0; i < num; i++){
                fila.enfileira(fila.desenfileira());
            }
            System.out.println("Eliminado = " + fila.desenfileira());
        }
        
        System.out.println("Ganhador: " + fila.desenfileira());
        
    }
    
}
