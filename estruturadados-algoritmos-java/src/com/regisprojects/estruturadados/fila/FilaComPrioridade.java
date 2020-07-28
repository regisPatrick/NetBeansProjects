/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.fila;

/**
 *
 * @author user
 */
public class FilaComPrioridade<T> extends Fila<T>{

    @Override
    public void enfileira(T elemento) {
        
        Comparable<T> chave = (Comparable<T>) elemento;
        
        int i;
        for (i = 0; i < this.tamanho; i++){
            if(chave.compareTo(this.elementos[i]) < 0){
                break;
            }
        }
        this.adiciona(i, elemento);
        
    }
    
}
