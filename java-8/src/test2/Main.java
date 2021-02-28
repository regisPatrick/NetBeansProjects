/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker1());
        Thread t2 = new Thread(new Worker2(t1));

        t1.start();
        t2.start();
    }
}