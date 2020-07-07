/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.pilha;

import com.regisprojects.estruturadados.base.EstruturaEstatica;

/**
 *
 * @author user
 */
public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(){
        super();
    }
    
    public Pilha(int capacidade){
        super(capacidade);
    }
    
    public void empilha(T elemento){
        super.adiciona(elemento);
    }
    
    public T topo(){
        if(this.estaVazia()){
            return null;
        }
        
        return this.elementos[tamanho -1];
    }
    
    public T desempilha(){
        
        if(this.estaVazia()){
            return null;
        }
        
        /*T elemento = this.elementos[tamanho -1];
        tamanho--;
        
        return elemento;*/
        
        return this.elementos[--tamanho];
    }
    
}
