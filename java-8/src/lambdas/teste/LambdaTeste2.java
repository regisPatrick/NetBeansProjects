/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas.teste;

import comportamentoporparametro.Carro;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 * @author user
 */
public class LambdaTeste2 {
    
    public static void main(String[] args) {
        
        forEach(asList("Regis", "Java", "facebook.com"), (String s) -> System.out.println(s));
        List<Integer> list = map(asList("Regis", "Java", "facebook.com"), (String s) -> s.length());
        List<Carro> carros = asList(new Carro("Preto", 2011), new Carro("Preto", 2011), new Carro("Preto", 2011));
        List<String> listCores = map(carros, (Carro c) -> c.getCor());
        System.out.println(listCores);
        System.out.println(list);
        
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
