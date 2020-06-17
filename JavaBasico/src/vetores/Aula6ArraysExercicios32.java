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
public class Aula6ArraysExercicios32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o número da posição: " + i + " do vetor A");
            vetorA[i] = scan.nextInt();
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("-------------------------------");
            System.out.println("*********Tabuada do " + vetorA[i] + "**********");
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " * " + vetorA[i] + " = " + (vetorA[i] * j));
            }
            System.out.println("--------------------------------");
            System.out.println("");
        }

    }

}
