/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.fila.labs;

import com.regisprojects.estruturadados.fila.FilaComPrioridade;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class PSNovosPacientes implements Runnable{

    private FilaComPrioridade<Pessoa> fila;
    private int cont = 7;
    private Random prioridade = new Random();

    public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }
    
    @Override
    public void run() {
        
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(8000);
                Pessoa p = new Pessoa("" + cont, prioridade.nextInt(3));
                fila.enfileira(p);
                cont++;
                System.out.println(p + " enfileirada.");
            } catch (InterruptedException ex) {
                Logger.getLogger(PSNovosPacientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
