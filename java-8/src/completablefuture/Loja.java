/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Loja {
    
    public double getPreco(){
        // Vai pegar o preço em diversos lugares(não sabe quanto tempo vai demorar)
        return calcularPreco();
    }
    
    public Future<Double> getPrecoAsync(){
        CompletableFuture<Double> precoFuturo = new CompletableFuture<>();
        new Thread(()-> {
            precoFuturo.complete(calcularPreco());
        }).start();
        return precoFuturo;
    }
    
    private double calcularPreco(){
        delay();
        return ThreadLocalRandom.current().nextDouble() * 100;
    }
    
    private static void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Loja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
