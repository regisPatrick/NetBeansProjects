/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.vetor;

import java.lang.reflect.Array;

/**
 *
 * @author user
 */
public class Lista<T> {
    
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];  // Solução do livro effectice java
        this.tamanho = 0;
    }
    
    public Lista(){
        this(10);
    }
    
    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }
    
    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } 
        return false;
    }
    
    public boolean adiciona(int posicao, T elemento){
        
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        
        this.aumentaCapacidade();
        
        // Mover todos os elementos
        for(int i = this.tamanho - 1 ; i >= posicao; i--){
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        
        return true;
    }
    
    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    public T obtem(int posicao){
        return this.busca(posicao);
    }
    
    public T busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }
    
    public int busca(T elemento){
        for (int i = 0; i < this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    
    public int ultimoIndice(T elemento){
        
//        int ultimaPos = -1;
//        
//        for(int i = 0; i < this.tamanho; i++){
//            if(this.elementos[i].equals(elemento)){
//                ultimaPos = i;
//            }
//        }
//        
//        return ultimaPos;
        
        for(int i = this.tamanho - 1; i >= 0; i--){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    
    public boolean contem(T elemento){
        
        /*int pos = busca(elemento);
        if(pos > -1){
            return true;
        }
        
        return false;*/
        
        return busca(elemento) > -1; // >= 0
    }
    
    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i = posicao; i < this.tamanho - 1; i++){
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }
    
    public void remove(T elemento){
        int pos = this.busca(elemento);
        if(pos > -1){
            this.remove(pos);
        }
    }
    
    public void limpar(){
        
        // Opção 1
        // this.elementos = (T[]) new Object[this.elementos.length];
        
        // Opção 2
        // this.tamanho = 0;
        
        // Opção 3
        for(int i = 0; i < this.tamanho; i++){
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        s.append("[");
        
        for(int i = 0; i < this.tamanho - 1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho-1]);
        }
        
        s.append("]");
        
        return s.toString();
    }
    
}
