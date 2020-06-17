/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author user
 */
public class Principal {
    
    public static void main(String[] args){
        
        GerenciadorImpressao g1 = GerenciadorImpressao.getInstance();
        GerenciadorImpressao g2 = GerenciadorImpressao.getInstance();
        GerenciadorImpressao g3 = GerenciadorImpressao.getInstance();
        GerenciadorImpressao g4 = GerenciadorImpressao.getInstance();
        
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
        
    }
    
}
