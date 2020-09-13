/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.thread.aula74.labs;

/**
 *
 * @author user
 */
public enum CorSemaforo {
    
    VERDE(1000), AMARELO(300), VERMELHO(2000);
    
    private int tempoEspera;
    
    CorSemaforo(int tempoEspera){
        this.tempoEspera = tempoEspera;
    }
    
    public int getTempoEspera(){
        return tempoEspera;
    }
    
}
