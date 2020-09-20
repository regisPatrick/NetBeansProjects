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
public class OptionalTest1 {

    private String nome;
    
    public static void main(String[] args) {
        
        OptionalTest1 ot = new OptionalTest1();
        Optional<String> optional1 = Optional.of("Regis");
        Optional<String> optional2 = Optional.empty();
        Optional<String> optional3 = Optional.ofNullable(ot.nome);
        // Imprimindo
        System.out.println(optional1);
        System.out.println(optional2);
//        if(ot.nome != null){
//            System.out.println(ot.nome.toUpperCase());
//        }
        System.out.println(optional3);
        // Buscando valores
        System.out.println(optional1.orElse("vazio"));
        if(optional2.isPresent()){
            System.out.println(optional2.get());
        }
        System.out.println(optional2.orElse("vazio"));
        System.out.println(optional3.orElse("vazio"));
    }
    
}
