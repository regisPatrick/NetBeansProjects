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
public class Aula6ArraysExercicios36 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[11];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o número da posição: " + i + " do vetor A");
            vetorA[i] = scan.nextInt();
            vetorA[i] = (int) Math.pow(2, i);
        }

        System.out.println("");
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("O valor do vetor é: " + vetorA[i]);
        }
        System.out.println("");

    }

}
