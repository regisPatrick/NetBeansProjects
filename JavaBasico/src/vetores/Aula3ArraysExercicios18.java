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
public class Aula3ArraysExercicios18 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Entre com a idade da pessoa: " + (i + 1));
            idades[i] = scan.nextInt();
        }

        int menorIdade = idades[0];
        int indexMenor = 0;
        int maiorIdade = idades[0];
        int indexMaior = 0;
        for (int i = 1; i < idades.length; i++) {
            if ( idades[i] > maiorIdade ){
                maiorIdade = idades[i];
                indexMaior = i;
            } else if ( idades[i] < menorIdade ) {
                menorIdade = idades[i];
                indexMenor = i;
            }
        }
        
        System.out.print("Vetor A = ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();
        System.out.println("A pessoa com menor idade tem: " + menorIdade + " no índice " + indexMenor);
        System.out.println("A pessoa com maior idade tem: " + maiorIdade + " no índice " + indexMaior);
        
    }

}
