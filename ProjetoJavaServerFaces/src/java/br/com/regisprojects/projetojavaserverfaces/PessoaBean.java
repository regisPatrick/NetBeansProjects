/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.projetojavaserverfaces;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author user
 */
@RequestScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean {
    
    private String nome;
    private String sobrenome;
    private String nomeCompleto;
    private List<String> nomes = new ArrayList<>();

    
    
    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void mostrarNome(){
        this.setNomeCompleto(this.getNome() + " " + this.getSobrenome());
    }
    
     public void addNome(){
        nomes.add(this.getNomeCompleto());
    }
    
}