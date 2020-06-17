/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesutilitariasjava;

import java.util.Random;

/**
 *
 * @author user
 */
public class Aula14Random {
    
    public static void main(String[] args) {
        
        System.out.println(Math.floor(Math.random() * 100));
        
        Random aleatorio = new Random();
        
        System.out.println(aleatorio.nextInt());
        
        System.out.println(aleatorio.nextInt(101));
        
        System.out.println(aleatorio.nextInt(5 + 1));// Número aleatório de 0 a 5, é 5 + 1, para que o 5 seja incluído nas possibilidades de números aleatórios.
        
    }
    
}
