/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author user
 */
public class Teste {
    
public static void main(String[] args) {
        
        Cliente6 c1 = new Cliente6("Regis", true, "123", 5);
        Cliente6 c2 = new Cliente6("Maria", true, "456", 10);
        Cliente6 c3 = new Cliente6("Jose", true, "789", 20);
        
        List<Cliente6> clientes = Arrays.asList(c1, c2, c3);
//        clientes.forEach(c -> System.out.println(c.getPontos()));
        
//        Stream<Cliente6> stream = clientes.stream().filter(c -> c.getPontos() > 5);
        
//        Stream<Integer> stream1 = clientes.stream().map(c -> c.getPontos());

//        IntStream stream1 = clientes.stream().mapToInt(c -> c.getPontos());
        
//        LongStream stream1 = clientes.stream().mapToLong(c -> c.getPontos());
        

//        List<Cliente6> pontosMaiorCinco = stream.collect(Collectors.toList());

//        List<Cliente6> stream = clientes.stream().filter(c -> c.getPontos() > 5).collect(Collectors.toList());
    Set<Cliente6> stream = clientes.stream().filter(c -> c.getPontos() > 5).collect(Collectors.toSet());
    stream.forEach(c -> System.out.println(c.getPontos()));
//        pontosMaiorCinco.forEach(c -> System.out.println(c.getPontos()));
    }
    
}
