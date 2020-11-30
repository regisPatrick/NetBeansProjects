/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.summarizingDouble;

/**
 *
 * @author user
 */
public class StreamTest6Collectors1 {
    
    // Redução e sumarização de Streams em um valor único
    // Agrupamento de elementos
    // Particionamento de elementos
    
    public static void main(String[] args) {
        
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();

        System.out.println(pessoas.stream().count());
        System.out.println(pessoas.stream().collect(Collectors.counting()));
        
        Optional<Pessoa> max = pessoas.stream().max(Comparator.comparing(Pessoa::getSalario));
        System.out.println(max.get().getSalario());

//        Optional<Pessoa> collect = pessoas.stream().collect(Collectors.maxBy(Comparator.comparing(Pessoa::getSalario)));
        Optional<Pessoa> collect = pessoas.stream().collect(maxBy(comparing(Pessoa::getSalario)));
        System.out.println(collect.get().getSalario());
        
        Optional<Pessoa> collect1 = pessoas.stream().collect(minBy(comparing(Pessoa::getSalario)));
        System.out.println(collect1.get().getSalario());
        
        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).sum());
        System.out.println(pessoas.stream().collect(Collectors.summingDouble(Pessoa::getSalario)));
        
        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).average());
        System.out.println(pessoas.stream().collect(Collectors.averagingDouble(Pessoa::getSalario)));
        
        DoubleSummaryStatistics collect2 = pessoas.stream().collect(summarizingDouble(Pessoa::getSalario));
        System.out.println(collect2);
        
        System.out.println(pessoas.stream().map(Pessoa::getNome).collect(Collectors.joining(", ")));
        
    }
    
}
