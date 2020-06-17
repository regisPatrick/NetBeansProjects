/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author user
 */
public class Teste3 {
    
    public static void main(String[] args) {
        Cliente3 c1 = new Cliente3("Regis", true, "123");
        Cliente3 c2 = new Cliente3("Jose", true, "456");
        c1.autenticaSenha("852");
        
        List<Cliente3> clientes = Arrays.asList(c1, c2);
//        Consumer<Cliente3> consumidor = new Consumer<Cliente3>(){
//            @Override
//            public void accept(Cliente3 c3) {
//                System.out.println(c3.getNome());
//            }          
//        }; 
        

//        Consumer<Cliente3> consumidor = (Cliente3 c3) -> {System.out.println(c3.getNome());};
                 

        clientes.forEach(c3 -> System.out.println(c3.getNome()));
        
        Runnable r = () -> System.out.println("Olá Mundo");
        new Thread(r).start();
    }
    
}
