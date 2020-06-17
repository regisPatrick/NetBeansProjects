/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizes;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MatrizesExer03 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[][] valores = new int[3][3];
        
        for(int i = 0; i < valores.length; i++){
            for(int j = 0; j < valores[i].length; j++){
                System.out.println("Entre com o valor da linha " + i + " coluna " + j);
                valores[i][j] = scan.nextInt();
            }
        }
        
        int qtdPar = 0;
        int qtdImpar = 0;
        for(int i = 0; i < valores.length; i++){
            for(int j = 0; j < valores[i].length; j++){
                System.out.print(valores[i][j] + " ");
                
                if(valores[i][j] % 2 == 0){
                    qtdPar++;
                } else {
                    qtdImpar++;
                }
            }
            System.out.println("");
        }
        System.out.println("A quantidade de pares dessa matriz é: " + qtdPar);
        System.out.println("A quantidade de impares dessa matriz é: " + qtdImpar);
    }
    
}
