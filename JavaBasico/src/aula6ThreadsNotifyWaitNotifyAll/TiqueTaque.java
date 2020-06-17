/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6ThreadsNotifyWaitNotifyAll;

/**
 *
 * @author user
 */
public class TiqueTaque {

    boolean tique;

    synchronized void tique(boolean estaExecutando) {

        if (!estaExecutando) {
            tique = true;
            notify();
            return;
        }
        System.out.print("Tique ");

        tique = true;

        notify();

        try {
            while (tique) {
                wait();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    synchronized void taque(boolean estaExecutando) {

        if (!estaExecutando) {
            tique = false;
            notify();
            return;
        }
        System.out.println("Taque");

        tique = false;

        notify();

        try {
            while (!tique) {
                wait();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }    
}