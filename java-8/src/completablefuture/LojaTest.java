/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package completablefuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class LojaTest {

    public static void main(String[] args) {
        Loja americanas = new Loja();
        Loja casasBahia = new Loja();
        Loja bestBuy = new Loja();
        Loja wallmart = new Loja();

//        long start = System.currentTimeMillis();
//        
//        System.out.println(americanas.getPreco());
//        System.out.println(casasBahia.getPreco());
//        System.out.println(bestBuy.getPreco());
//        System.out.println(wallmart.getPreco());
//        
//        System.out.println(System.currentTimeMillis() - start + " ms");
        long start = System.currentTimeMillis();
        Future<Double> precoAsync = americanas.getPrecoAsync();
        Future<Double> precoAsync1 = casasBahia.getPrecoAsync();
        Future<Double> precoAsync2 = bestBuy.getPrecoAsync();
        Future<Double> precoAsync3 = wallmart.getPrecoAsync();
        long end = System.currentTimeMillis();
        System.out.println("Tempo do invocação: " + (end - start) + " ms");
        enrolando();
        try {
            System.out.println("Americanas " + precoAsync.get());
            System.out.println("Casas Bahia " + precoAsync1.get());
            System.out.println("Best Buy " + precoAsync2.get());
            System.out.println("Wallmart " + precoAsync3.get());
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(LojaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Tempo que levou para pegar o resultado: " + (System.currentTimeMillis() - start) + " ms");
    }

    private static void enrolando() {
        long soma = 0;
        for (int i = 0; i < 1_000_000; i++) {
            soma += i;
        }
        System.out.println(soma);
    }

}
