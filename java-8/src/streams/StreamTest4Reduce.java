/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import static java.util.Arrays.asList;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author user
 */
public class StreamTest4Reduce {
    
    public static void main(String[] args) {
        
        Stream<Integer> stream = getStream();
        Optional<Integer> reduce = stream.reduce((x, y) -> x + y);
        
        stream = getStream();
        Integer soma = stream.reduce(0, (x, y) -> x + y);
        
        stream = getStream();
        Optional<Integer> soma2 = stream.reduce(Integer::sum);
        
        System.out.println(reduce.get());
        System.out.println(soma);
        System.out.println(soma2.get());
        
    }
    
    private static Stream<Integer> getStream(){
        return asList(1, 2, 3, 4, 5, 6).stream();
    }
    
}
