/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenciademetodo;

import lambdas.*;
import interfacesfuncionais.*;
import metodosdefault.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author user
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Regis", true, "123");
        Cliente c2 = new Cliente("João", true, "987");
        
        c1.autenticaSenha("852");
        
        List<Cliente> clientes = Arrays.asList(c1, c2);
        
//        Consumer<Cliente> consumidor = new Consumer<Cliente>(){
//            @Override
//            public void accept(Cliente c) {           //Classe Anônima
//                
//                System.out.println(c.getNome());
//                
//            }
//            
//        };

//        Consumer<Cliente> consumidor = (Cliente c) -> {System.out.println(c.getNome());};//Expressão Lambda
        
//        clientes.forEach((Cliente c) -> {System.out.println(c.getNome());});//Expressão Lambda

//        clientes.forEach(c -> {System.out.println(c.getNome());});//Expressão Lambda

//        clientes.forEach(c -> System.out.println(c.getNome()));//Expressão Lambda
        

        clientes.forEach(Cliente::getNome); //Referência ao método
        
        Cliente c3 = new Cliente("Ana", false, "333");     //Referência ao método
        Consumer<Cliente> consumidor1 = Cliente::getNome;  //Referência ao método
        consumidor1.accept(c3);                            //Referência ao método
        
        
        Runnable r1 = c3::getNome;
        r1.run();


        Runnable r = () -> System.out.println("Olá mundo");//Expressão Lambda
        new Thread(r).start();
    }
} 
