/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import static java.util.Arrays.asList;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 *
 * @author user
 */
public class StreamTest4Reduce {
    
    public static void main(String[] args) {
        
        Optional<Integer> reduce = getStream().reduce((x, y) -> x + y);
        System.out.println(reduce.get());

        Integer soma = getStream().reduce(0, (x, y) -> x + y);
        System.out.println(soma);
        
        Optional<Integer> soma2 = getStream().reduce(Integer::sum);
        System.out.println(soma2.get());
        
        Optional<Integer> mult = getStream().reduce((x, y) -> x * y);
        System.out.println(mult.get());
        
        Integer mult1 = getStream().reduce(0, (x, y) -> x * y);
        System.out.println(mult1);
        
        Optional<Integer> max = getStream().reduce((x, y) -> x > y ? x : y);
        System.out.println(max.get());
        
        Optional<Integer> max2 = getStream().reduce(Integer::max);
        System.out.println(max2.get());
        
        Stream<Pessoa> streamPessoa = Pessoa.bancoDePessoas().stream();
        Optional<Double> somaSalario = streamPessoa
                .filter(p -> p.getSalario() > 4000)
                .map(Pessoa::getSalario)
                .reduce(Double::sum);
        System.out.println(somaSalario.get());
        
        Double somaDouble = Pessoa.bancoDePessoas().stream()
                .filter(p -> p.getSalario() > 4000)
                .mapToDouble(Pessoa::getSalario)
                .sum();
        System.out.println(somaDouble);
        
        DoubleStream doubleStream = Pessoa.bancoDePessoas().stream()
                .filter(p -> p.getSalario() > 4000)
                .mapToDouble(Pessoa::getSalario);
        Stream<Double> doubleStream2 = doubleStream.boxed();
    }
    
    private static Stream<Integer> getStream(){
        return asList(1, 2, 3, 4, 5, 6).stream();
    }
    
}
