/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.fila.labs;

/**
 *
 * @author user
 */
public class Pessoa implements Comparable<Pessoa>{
    
    private String nome;
    private int prioridade;

    public Pessoa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Pessoa o) {
        
        if(prioridade > o.prioridade){
            return 1;
        } else if (prioridade < o.prioridade){
            return -1;
        }
        return 0;  
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", prioridade=" + prioridade + '}';
    }
    
}
