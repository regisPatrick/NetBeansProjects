/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.fila;

import com.regisprojects.estruturadados.base.EstruturaEstatica;

/**
 *
 * @author user
 */
public class Fila<T> extends EstruturaEstatica<T>{
    
    public Fila(){
        super();
    }
    
    public Fila(int capacidade){
        super(capacidade);
    }
    
    public void enfileira(T elemento){
        // this.elementos[this.tamanho] = elemento;
        // this.tamanho++;
        
        // this.elementos[this.tamanho++] = elemento;
        
        this.adiciona(elemento);
    }
    
    public T espiar(){
        
        if(this.estaVazia()){
            return null;
        }
        
        return this.elementos[0];
    }
    
    public T desenfileira(){
        
        final int POS = 0;
        
        if(this.estaVazia()){
            return null;
        }
        
        T elementoASerRemovido = this.elementos[POS];
        
        this.remove(POS);
        
//        for (int i = POS; i < tamanho - 1; i++){
//            elementos[i] = elementos[i+1];
//        }
//        tamanho--;
        
        return elementoASerRemovido;
        
    }
    
}