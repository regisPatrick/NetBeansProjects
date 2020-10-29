/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.stream.IntStream;

/**
 *
 * @author user
 */
public class StreamTest5GerandoStrams {
    
    public static void main(String[] args) {
        
        IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + " "));
        
    }
    
}
