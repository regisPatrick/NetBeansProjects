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
public class Aula6ArraysExercicios33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o número da posição: " + i + " do vetor A");
            vetorA[i] = scan.nextInt();
        }

        boolean primo;
        String msg;
        
        System.out.println("Verificação de números primos = ");
        for (int i = 0; i < vetorA.length; i++) {
            primo = true;
            for(int j = 2; j < vetorA[i]; j++){
                if(vetorA[i] % j == 0){
                    primo = false;
                    break;
                }
            }
            msg = "";
            if (primo){
                msg = " Primo ";
            } else {
                msg = " Não é primo ";
            }
            
            System.out.println(vetorA[i] + msg);
        }
        System.out.println("");

    }

}
