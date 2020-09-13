/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas.teste;

import comportamentoporparametro.Carro;
import comportamentoporparametro.ComparadorCarro;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 * @author user
 */
public class LambdaTeste3 {
    
    public static void main(String[] args) {
        
        forEach(asList("Regis", "Java", "facebook.com"), System.out::println);
        List<Carro> carros = asList(new Carro("Vermelho", 1999), new Carro("Azul", 2005), new Carro("Preto", 1985));
        // Collections.sort(carros, (o1, o2) -> o1.getCor().compareTo(o2.getCor()));
        // System.out.println(carros);
        // Reference to a Static method
        Collections.sort(carros, ComparadorCarro::comparePorCor);
        System.out.println(carros);
        // Reference to an instance method of Particular object
        ComparadorCarro comparadorCarro = new ComparadorCarro();
        Collections.sort(carros, comparadorCarro::comparePorAno);
        System.out.println(carros);
        // Reference to an instance method of an arbitrary object of a particular type
        List<String> nomes = asList("Regis", "Java", "Facebook.com", "Jose");
        nomes.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(nomes);
        nomes.sort(String::compareTo);
        System.out.println(nomes);
        Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringToInteger2 = Integer::parseInt;
        System.out.println(stringToInteger.apply("1"));
        System.out.println(stringToInteger2.apply("8"));
        
    }
    
    public static <T> void forEach(List<T> list, Consumer<T> c){
        for (T e : list){
            c.accept(e);
        }
    }
    
    public static <T,R> List<R> map(List<T> list, Function<T,R> f){
        List<R> result = new ArrayList<>();
        for(T e : list){
            result.add(f.apply(e));
        }
        return result;
    }
    
}
