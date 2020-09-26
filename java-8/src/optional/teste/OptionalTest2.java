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
        
        Seguradora seguradora = new Seguradora("Regis Seguros");
        Carro2 carro = new Carro2(seguradora, "Audi");
        Pessoa2 p = new Pessoa2(carro, "Carlos");
        // p = null;
        System.out.println(obterNomeSeguradora(Optional.ofNullable(p)));
        
    }
    
    private static void checarNomeSeguradora(Seguradora seguradora){
        if (seguradora != null && seguradora.getNome().equals("Regis Seguros")){
            System.out.println("é o Regis");
        }
    }
    
    private static void checarNomeSeguradoraOptional(Seguradora seguradora){
        Optional<Seguradora> seguradoraOptional = Optional.ofNullable(seguradora);
        seguradoraOptional.filter(s -> s.getNome().equals("Regis Seguros"))
    }
    
    public static String obterNomeSeguradora(Optional<Pessoa2> p){
        return p.flatMap(Pessoa2::getCarro)
                   .flatMap(Carro2::getSeguradora)
                   .map(Seguradora::getNome)
                   .orElse("Não existe seguradora");
        
    }
    
}
