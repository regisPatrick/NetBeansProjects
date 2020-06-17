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
public class Aula4ArraysExercicios20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        System.out.println("Entre com a cotação do dólar: ");
        cotacao = scan.nextDouble();
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i+1);
        }

        System.out.println("");
        System.out.println("vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }
    }

}
