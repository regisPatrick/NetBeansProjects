/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 *
 * @author user
 */
public class TesteStream {

    public static void main(String[] args) {
        
        Cliente5 c1 = new Cliente5("Regis", true, "123", 5);
        Cliente5 c2 = new Cliente5("Maria", true, "456", 10);
        Cliente5 c3 = new Cliente5("Jose", true, "789", 20);
        
        List<Cliente5> clientes = Arrays.asList(c1, c2, c3);
        clientes.forEach(c -> System.out.println(c.getPontos()));
        
        Stream<Cliente5> stream = clientes.stream().filter(c -> c.getPontos() > 5);
        
//        Stream<Integer> stream1 = clientes.stream().map(c -> c.getPontos());

        IntStream stream1 = clientes.stream().mapToInt(c -> c.getPontos());
        
//        LongStream stream1 = clientes.stream().mapToLong(c -> c.getPontos());
        
    }
    
}
