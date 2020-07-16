/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author user
 */
public class Persona {
    
    private int id;
    private String nome;
    private String apodo;
    private Pais pais;
    private Ciudad ciudad;

//    public Persona(int id, String nome, String apodo) {
//        this.id = id;
//        this.nome = nome;
//        this.apodo = apodo;
//    }
//    
//    public Persona(int id){
//        this.id = id;
//    }
//    
//    public Persona(String apodo){
//        this.apodo = apodo;
//    }

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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    @PostConstruct
    private void init(){
        System.out.println("Antes de inicializar el bean");
    }
    
    @PreDestroy
    private void destroy(){
        System.out.println("Bean a punto de ser destruido");
    }
    
}
