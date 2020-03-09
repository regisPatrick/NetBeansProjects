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
public class Aula5ArraysExercicios25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

//        for (int i = 0; i < vetorA.length; i++) {
//            System.out.println("Entre com o valor da posição: " + i);
//            vetorA[i] = scan.nextInt();
//            if (vetorA[i] % 2 == 0){
//                vetorB[i] = 1;
//            } else {
//                vetorB[i] = 0;
//            }
//        }
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            
            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
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
    }
}
