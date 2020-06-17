/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referencia_de_metodo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author user
 */
public class Teste4 {
  public static void main(String[] args) {
        Cliente4 c1 = new Cliente4("Regis", true, "123");
        Cliente4 c2 = new Cliente4("Jose", true, "456");
        c1.autenticaSenha("852");
        
        List<Cliente4> clientes = Arrays.asList(c1, c2);
//        Consumer<Cliente3> consumidor = new Consumer<Cliente3>(){  // Classe Anônima
//            @Override
//            public void accept(Cliente3 c3) {
//                System.out.println(c3.getNome());
//            }          
//        }; 
        

//        Consumer<Cliente3> consumidor = (Cliente3 c3) -> {System.out.println(c3.getNome());}; // Espressão Lambda
                 

//        clientes.forEach(c3 -> System.out.println(c3.getNome())); // Espressão Lambda

        clientes.forEach(Cliente4::getNome);
        
        Cliente4 c3 = new Cliente4("Ana", false, "333");
        
        Consumer<Cliente4> consumer1 = Cliente4::getNome;
        consumer1.accept(c3);
        
        Runnable r1 = c3::getNome;
        r1.run();
        
        Runnable r = () -> System.out.println("Olá Mundo"); // Espressão Lambda
        new Thread(r).start();
    }
    
}
