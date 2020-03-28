/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author user
 */
public class Excecao {

    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];

            System.out.println("Antes da Exception");

            vetor[4] = 1;

            System.out.println("Esse texto não será impresso");
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceção ao acessar um índice do vetor que não existe.");
        }
        
        System.out.println("Esse texto será impresso após a exception");
        
    }

}
