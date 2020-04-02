/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class UsandoMinhaException {

    public static void main(String[] args) {
        
        try {
            teste();
        } catch (DivisaoNaoExata ex) {
            Logger.getLogger(UsandoMinhaException.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
    public static void teste() throws DivisaoNaoExata{    
        int[] numeros = {4, 8, 5 ,16, 32, 21, 64, 128};
        int[] denom = {2, 0, 4, 8, 0, 2, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0){
                    //lançar a exception aqui
                    // throw new Exception("Número ímpar, divisão não exata");
                    throw new DivisaoNaoExata(numeros[i], denom[i]);
                }
                System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i] / denom[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
                System.out.println("Aconteceu um erro");
                e.printStackTrace();
            } /* catch (Exception e) {
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            }*/

        }

    }

}
