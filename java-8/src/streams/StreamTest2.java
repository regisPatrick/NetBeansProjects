/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author user
 */
public class StreamTest2 {

    public static void main(String[] args) {
        
        List<List<String>> nomes = new ArrayList<>();
        nomes.add(asList("Regis", "Goku"));
        nomes.add(asList("Jose", "Antonio"));
//        Stream<List<String>> stream = nomes.stream();
        nomes.stream().flatMap(Collection::stream);
        System.out.println(nomes);
        
    }
    
}
