/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.fila.labs;

import com.regisprojects.estruturadados.fila.FilaComPrioridade;

/**
 *
 * @author user
 */
public class PSNovosPacientes implements Runnable{

    private FilaComPrioridade<Pessoa> fila;

    public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }
    
    @Override
    public void run() {
        
    }
    
}
