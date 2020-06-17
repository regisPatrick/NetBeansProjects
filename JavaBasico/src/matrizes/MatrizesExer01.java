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
public class MatrizesExer01 {
 
    public static void main(String[] args) {
        
        int[][] valores = new int[4][4];
        
        Random numeroRandom = new Random();
        
        for(int i = 0; i < valores.length; i++){
            for (int j = 0; j < valores[i].length; j++){
                valores[i][j] = numeroRandom.nextInt(100);
            }
        }
        
        int maiorNum = 0;
        int linha = 0;
        int col = 0;
        for(int i = 0; i < valores.length; i++){
            for(int j = 0; j < valores[i].length; j++){
                
                System.out.print(valores[i][j] + " ");
                
                if(valores[i][j] > maiorNum){
                    maiorNum = valores[i][j];
                    linha = i;
                    col = j;
                }
            }
            System.out.println();
        }
        System.out.println("Maior valor: " + maiorNum);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + col);
    }
    
}
