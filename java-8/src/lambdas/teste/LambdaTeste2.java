/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas.teste;

import static java.util.Arrays.asList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author user
 */
public class LambdaTeste2 {
    
    public static void main(String[] args) {
        
        forEach(asList("Regis", "Java", "facebook.com"), (String s) -> System.out.println(s));
        
    }
    
    public static <T> void forEach(List<T> list, Consumer<T> c){
        for (T e : list){
            c.accept(e);
        }
    }
    
}
