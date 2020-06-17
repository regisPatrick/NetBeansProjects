/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizes;

import java.util.Random;

/**
 *
 * @author user
 */
public class MatrizesExer02 {

    public static void main(String[] args) {

        int[][] valores = new int[10][10];

        Random numeroRandom = new Random();

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                valores[i][j] = numeroRandom.nextInt(100);
            }
        }

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {

                System.out.print(valores[i][j] + " ");

            }
            System.out.println();
        }
        
        int maiorL5 = 0;
        int menorL5 = 101;
        int linha5 = 5;
        for(int i = 0; i < valores[linha5].length; i++){
            if (valores[linha5][i] > maiorL5){
                maiorL5 = valores[linha5][i];
            }
            if (valores[linha5][i] < menorL5){
                menorL5 = valores[linha5][i];
            }
        }
        System.out.println("Maior valor da linha 5 = " + maiorL5);
        System.out.println("Menor valor da linha 5 = " + menorL5);
        
        int maiorC7 = 0;
        int menorC7 = 101;
        int col7 = 7;
        for(int i = 0; i < valores.length; i++){
            if (valores[i][col7] > maiorC7){
                maiorC7 = valores[i][col7];
            }
            if (valores[i][col7] < menorC7){
                menorC7 = valores[i][col7];
            }
        }
        
        System.out.println("Maior valor da coluna 7 = " + maiorC7);
        System.out.println("Menor valor da coluna 7 = " + menorC7);

    }

}
