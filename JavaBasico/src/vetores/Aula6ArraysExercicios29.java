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
public class Aula6ArraysExercicios29 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length + vetorB.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o número da posição: " + i + " do vetor A");
            vetorA[i] = scan.nextInt();
            vetorC[i] = vetorA[i];
        }
        
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Entre com o número da posição: " + i + " do vetor B");
            vetorB[i] = scan.nextInt();
            vetorC[vetorB.length + i] = vetorB[i];
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("");
        
        System.out.print("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println("");

    }

}
