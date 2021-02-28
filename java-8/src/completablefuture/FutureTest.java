/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package completablefuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class FutureTest {

    private static ExecutorService executorService = Executors.newFixedThreadPool(1);
    
    public static void main(String[] args) {
        
        Future<Double> future = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(2);
            return 2000D; 
        });
        enrolando();
        try {
            while(!future.isDone()){
                Double resultado = future.get();
                System.out.println(resultado);
            }
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(FutureTest.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            executorService.shutdown();
        }
//        try {
//            Double resultado = future.get(3, TimeUnit.SECONDS);
//            System.out.println(resultado);
//        } catch (InterruptedException | ExecutionException | TimeoutException ex) {
//            Logger.getLogger(FutureTest.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            executorService.shutdown();
//        }
        
    }
    
    private static void enrolando(){
        long soma = 0;
        for(int i = 0; i < 1_000_000; i++){
            soma += i;
        }
        System.out.println(soma);
    }
    
}
