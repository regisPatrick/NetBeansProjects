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
public class Aula3ArraysExercicios16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        int somaMaior15 = 0;
        int qtdMaior15 = 0;
        int quantidadeIguala15 = 0;
        int somaInferior15 = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < 15) {
                somaInferior15 += vetorA[i];
            } else if ( vetorA[i] == 15 ){
                quantidadeIguala15++;
            } else if ( vetorA[i] > 15){
                somaMaior15 += vetorA[i];
                qtdMaior15++;
            }
        }
        
        double mediaNumAcima15 = somaMaior15 / qtdMaior15;

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Soma dos elementos inferiores a 15: " + somaInferior15);
        System.out.println("A quantidade de elementos que são iguais a 15: " + quantidadeIguala15);
        System.out.println("Media dos elementos superiores a 15: " + mediaNumAcima15);

    }

}
