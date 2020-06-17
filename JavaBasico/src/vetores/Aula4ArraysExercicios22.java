/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Aula4ArraysExercicios22 {
    
    public static void main(String[] args) {
        
        int[] vetorA = new int[10];
        int num0 = 0;
        int num1 = 0;
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);
            if (vetorA[i] == 0){
                num0++;
            }else{
                num1++;
            }
        }

        System.out.println("");
        System.out.println("vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        
        double porcNum0 = (num0 * 100)/vetorA.length;
        double porcNum1 = 100 - porcNum0;
        
        System.out.println("");
        System.out.println("O percentual de números 0 no Vetor A é: " + porcNum0 + "%");
        System.out.println("O percentual de números 1 no Vetor A é: " + porcNum1 + "%");
        
    }

}