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
public class MatrizIrregular {
 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o número de pessoa que serão entrevistadas: ");
        int numEntrevistados = scan.nextInt();
        
        String[][] nomesFilhos = new String[numEntrevistados][];
        
        for (int i = 0; i < nomesFilhos.length; i++){
            System.out.println("Entre com a quantidade de filhos: ");
            int qtdFilhos = scan.nextInt();
            
            nomesFilhos[i] = new String[qtdFilhos];
            
            for (int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println("Digite o nome do filho " + (j+1));
                
                nomesFilhos[i][j] = scan.next();
                
            }
        }
        
        for (int i = 0; i < nomesFilhos.length; i++){
            System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");
            for (int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println(nomesFilhos[i][j]);
            }
        }
        
    }
    
}
