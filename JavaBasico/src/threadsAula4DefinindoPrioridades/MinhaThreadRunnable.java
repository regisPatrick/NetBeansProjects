/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsAula4DefinindoPrioridades;

import threadsRunnable.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class MinhaThreadRunnable implements Runnable {

    private String nome;

    private int tempo;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        //start(); esse metodo não precisa ser chamado quando criamos uma thread implementando a interface Runnable, esse metodo nem está disponivel nesta interface
//        Thread t = new Thread(this);
//        t.start();
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(nome + " terminou a execução");
    }

}
