/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optional.teste;

import java.util.HashMap;
import java.util.Map;
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
        checarNomeSeguradora(seguradora);
        checarNomeSeguradora(seguradora);
        p.setIdade(20);
        System.out.println(obterNomeSeguradoraComIdade(p, 18));
        Map<String, String> map = new HashMap<>();
        System.out.println(Optional.ofNullable(map.get("kaka")));
        stringToInt("A");
        
    }
    
    /***
     * 
     * @param numero
     * @return 
     */
    private static Optional<Integer>stringToInt(String numero){
        try{
            return Optional.of(Integer.parseInt(numero));
        }catch (NumberFormatException e){
            // e.printStackTrace();
            return Optional.empty();
        }
    }
    
    private static void checarNomeSeguradora(Seguradora seguradora){
        if (seguradora != null && seguradora.getNome().equals("Regis Seguros")){
            System.out.println("é o Regis");
        }
    }
    
    private static void checarNomeSeguradoraOptional(Seguradora seguradora){
        //Optional<Seguradora> seguradoraOptional = Optional.ofNullable(seguradora);
        // seguradoraOptional.filter(s -> s.getNome().equals("Regis Seguros"))
                // .ifPresent(x -> System.out.println("é o Regis"));
                
        Optional.ofNullable(seguradora).filter(s -> s.getNome().equals("Regis Seguros"))
            .ifPresent(x -> System.out.println("é o Regis"));        
    }
    
    public static String obterNomeSeguradora(Optional<Pessoa2> p){
        return p.flatMap(Pessoa2::getCarro)
                   .flatMap(Carro2::getSeguradora)
                   .map(Seguradora::getNome)
                   .orElse("Não existe seguradora");
        
    }
    
    private static String obterNomeSeguradoraComIdade(Pessoa2 p, int idadeMinima){
        return Optional.ofNullable(p)
                .filter(pessoa -> pessoa.getIdade() >= idadeMinima)
                .flatMap(Pessoa2::getCarro)
                .flatMap(Carro2::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Não existe seguradora ou a idade mínima não foi atingida");
    }
    
}
