/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.spring.beans;

/**
 *
 * @author user
 */
public class Persona {
    
    private int id;
    private String nome;
    private String apodo;

    public Persona(int id, String nome, String apodo) {
        this.id = id;
        this.nome = nome;
        this.apodo = apodo;
    }
    
    public Persona(int id){
        this.id = id;
    }
    
    public Persona(String apodo){
        this.apodo = apodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    
}
