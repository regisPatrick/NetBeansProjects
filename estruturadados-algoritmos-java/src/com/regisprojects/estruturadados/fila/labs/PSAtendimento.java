/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.fila.labs;

import com.regisprojects.estruturadados.fila.FilaComPrioridade;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class PSAtendimento implements Runnable{

    private FilaComPrioridade<Pessoa> fila;

    public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }
    
    @Override
    public void run() {
        
        while(!fila.estaVazia()){
            try {
                System.out.println(fila.desenfileira() + " atendida.");
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PSAtendimento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println("Atendimento concluído.");
        
    }
    
}
