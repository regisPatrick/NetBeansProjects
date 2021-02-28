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
public class Worker2 implements Runnable {

    private Thread parent;

    public Worker2(Thread parent) {
        this.parent = parent;
    }

    public void run() {
        try {
            parent.join();

            System.out.println("Worker2 start");
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Worker2 end");
    }
}