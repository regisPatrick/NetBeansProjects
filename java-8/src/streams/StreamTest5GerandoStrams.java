/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author user
 */
public class StreamTest5GerandoStrams {
    
    public static void main(String[] args) {
        
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + " "));
        System.out.println("");
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + " "));
        
        Stream<String> stringStream = Stream.of("Regis", "Mundo Herói", "Patrick");
        System.out.println();
        stringStream.map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
        
        Stream<String> empty = Stream.empty();
        
        int nums[] = {1, 2, 3, 4, 5};
        OptionalDouble average = Arrays.stream(nums).average();
        System.out.println(average.getAsDouble());
        
        try(Stream<String> lines = Files.lines){
            
        }
    }
    
}
