/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class UsandoThrows {
    
    public static void main(String[] args) {
        
        System.out.println("Entre com um numero decimal");
        try {
            double num = leNumero();
            System.out.println("Você digitou " + num);
        } catch (Exception e) {
            // Logger.getLogger(UsandoThrows.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
        
    }
    
    public static double leNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
    
}
