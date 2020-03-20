/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

/**
 *
 * @author user
 */
public class TesteCalculadora {
    
    public static void main(String[] args) {
        
        int fatorialNR = Fatorial.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);
        
        int fatorialR = Fatorial.fatorialRecursivo(5);
        System.out.println(fatorialR);
        
    }
    
}
