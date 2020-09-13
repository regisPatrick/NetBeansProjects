/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.thread.aula74.labs;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ThreadSemaforo implements Runnable {

    private CorSemaforo cor;
    private boolean parar;
    private boolean corMudou;

    public ThreadSemaforo() {
        this.cor = CorSemaforo.VERMELHO;
        this.parar = false;
        this.corMudou = false;

        new Thread(this).start();
    }

    @Override
    public void run() {

        while (!parar) {
            try {
                /*switch (this.cor) {
                    case VERMELHO:
                        Thread.sleep(2000);
                        break;
                    case AMARELO:
                        Thread.sleep(300);
                        break;
                    case VERDE:
                        Thread.sleep(1000);
                        break;    
                }*/
                Thread.sleep(this.cor.getTempoEspera());
                
                this.mudarCor();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSemaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private synchronized void mudarCor(){
        switch(this.cor){
            case VERMELHO:
                this.cor = CorSemaforo.VERDE;
                break;
            case AMARELO:
                this.cor = CorSemaforo.VERMELHO;
                break;
            case VERDE:
                this.cor = CorSemaforo.AMARELO;
                break;
        }
        this.corMudou = true;
        notify();
    }
    
    public synchronized void esperaCorMudar(){
        while(!this.corMudou){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSemaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.corMudou = false;
    }
    
    public synchronized void desligarSemaforo(){
        this.parar = true;
    }
    
    public CorSemaforo getCor(){
        return cor;
    }

}
