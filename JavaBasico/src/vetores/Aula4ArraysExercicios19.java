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
public class Aula4ArraysExercicios19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] result = new double[notas1.length];

        for (int i = 0; i < notas1.length; i++) {
            System.out.println("Entre com a primeira nota do aluno: " + (i + 1));
            notas1[i] = scan.nextInt();
            
            System.out.println("Entre com a segunda nota do aluno: " + (i + 1));
            notas2[i] = scan.nextInt();
            
            result[i] = (notas1[i] + notas2[i]) / 2;
        }
        
        System.out.print("Notas 1 = ");
        for (int i = 0; i < notas1.length; i++){
            System.out.print(notas1[i] + " ");
        }
        
        System.out.println("");
        System.out.print("Notas 2 = ");
        for (int i = 0; i < notas2.length; i++){
            System.out.print(notas2[i] + " ");
        }
        
        System.out.println("");
        for (int i = 0; i < result.length; i++) {
            if ( result[i] >= 7 ) {
                System.out.println("O Aluno número: " + (i+1) + " está aprovado com a nota: " + result[i]);
            } else {
                System.out.println("O Aluno número: " + (i+1) + " está reprovado com a nota: " + result[i]);
            }    
        }
        
    }

}
