/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.thread.aula68;

/**
 *
 * @author user
 */
public class Teste {
    
    public static void main(String[] args) {
        
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 900);
//        Thread t1 = new Thread(thread1);
//        t1.start();
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 650);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1100);
    }
    
}
