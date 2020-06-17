/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulastring;

/**
 *
 * @author user
 */
public class Aula5 {
    
    public static void main(String[] args) {
        
        String banana = "banana";
        String ana = "ana";
        
        System.out.println(banana.indexOf('x')); //retorna -1
        System.out.println(banana.indexOf('b')); //retorna 0 pois o b aparece no índice 0
        System.out.println(banana.indexOf('a')); //retorna 1 pois o a aparece no índice 1
        System.out.println(banana.indexOf(ana)); //retorna 1 pois é o índice onde o nome ana aparece em primeiro
        
        System.out.println(banana.lastIndexOf('a')); //retorna 5 que é o índice da última vez que banana aparece
        System.out.println(banana.lastIndexOf(ana)); // retorna 3 que é a última vez que o nome ana aparece

        System.out.println(banana.contains(ana)); //retorna true ou false
        System.out.println(banana.contains("ceu"));
    }
    
}
