/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optional.teste;

import java.util.Optional;

/**
 *
 * @author user
 */
public class OptionalTest2 {
    
    public static void main(String[] args) {
        
        Seguradora s = new Seguradora("SSSS");
        System.out.println(obterNomeSeguradoraOptional(s));
        
    }
    
    public static String obterNomeSeguradoraOptional(Seguradora seguradora){
        System.out.println(Optional.ofNullable(seguradora).flatMap(Seguradora::getNome).orElse("vazio"));
        return "";
    }
    
    private static String obterNomeSeguradora(Seguradora seguradora){
        String nome = null;
        if(seguradora.getNome() != null){
            // nome = seguradora.getNome();
        }
        return nome;
    }
    
}
