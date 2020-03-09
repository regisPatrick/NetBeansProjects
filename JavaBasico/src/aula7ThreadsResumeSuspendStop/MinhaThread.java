/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7ThreadsResumeSuspendStop;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class MinhaThread implements Runnable {

    private String nome;
    
    private boolean estaSuspensa;
    
    private boolean foiTerminada;

    public MinhaThread(String nome) {
        this.nome = nome;
        this.estaSuspensa = false;
        new Thread(this, nome).start();
//        Thread t = new Thread(this, nome);  Posso fazer assim também
//        t.start();
    }

    @Override
    public void run() {
        System.out.println("Executando " + this.nome);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + nome + ", " + i);
                Thread.sleep(300);
                synchronized (this) {
                    while (estaSuspensa){
                        wait();
                    }
                    if (this.foiTerminada){
                        break;
                    }
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("Thread " + this.nome + " terminada.");
    }
    
    void suspend(){
        this.estaSuspensa = true;
    }
    
    synchronized void resume(){
        this.estaSuspensa = false;
        notify();
    }
    
    synchronized void stop(){
        this.foiTerminada = true;
        notify();
    }

}
