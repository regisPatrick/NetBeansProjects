/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
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
        List<String> collect = nomes.stream().flatMap(Collection::stream).collect(Collectors.toList());
//        collect.forEach(System.out::println);
        System.out.println(collect);
        
        List<String> palavras = asList("Ola", "Goku");
        String[] split = palavras.get(0).split("");
        System.out.println(Arrays.toString(split));
        List<String[]> collect1 = palavras.stream().map(p -> p.split("")).collect(Collectors.toList());
        
        
    }
    
}
