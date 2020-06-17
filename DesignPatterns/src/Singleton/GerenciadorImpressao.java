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
public class GerenciadorImpressao {
    
    private static GerenciadorImpressao gerenciadorImpressao;
    
    private GerenciadorImpressao(){
        
    }
    
    public static GerenciadorImpressao getInstance(){
        if (gerenciadorImpressao == null){
            gerenciadorImpressao = new GerenciadorImpressao();
        }
        return gerenciadorImpressao;
    }
    
}
