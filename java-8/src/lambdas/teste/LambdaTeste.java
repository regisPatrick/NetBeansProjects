/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas.teste;

import comportamentoporparametro.Carro;
import interfaces.CarroPredicate;

/**
 *
 * @author user
 */
public class LambdaTeste {
    
    public static void main(String[] args) {
        // Anônima
        // Função
        // Pode ser passada por argumento para algum método ou guardada em uma variável
        // Concisa
        // (Carro carro) -> carro.getCor().equals("verde");
        // (String s) -> s.length()
        // (int a, int b) -> {System.out.println(a + b)};
        
        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
        };
          
        CarroPredicate carroPredicate2 = (Carro carro) -> carro.getCor().equals("verde");
        
        System.out.println(carroPredicate.test(new Carro("verde", 2012)));
        System.out.println(carroPredicate2.test(new Carro("verde", 2012)));
        
        Runnable runnable = () -> System.out.println("Dentro do run");
        runnable.run();
        new Thread(runnable).start();
    }
    
}
