/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.sispetshop.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author user
 */
@Entity
public class Veterinario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @NotEmpty
    private String crmv;
    
    @NotEmpty
    private String nome;
    
    @NotEmpty
    private String idade;
    
    @NotEmpty
    private String telefone;
    
    @NotEmpty
    private String email;
    
    @NotEmpty
    private String endereco_residencial;
    
    @ManyToOne
    private ClinicaPetShop clinica;

    @OneToMany
    private List<Consulta> consultas;
    
    
    public Veterinario() {
    }

    
    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public ClinicaPetShop getClinica() {
        return clinica;
    }

    public void setClinica(ClinicaPetShop clinica) {
        this.clinica = clinica;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco_residencial() {
        return endereco_residencial;
    }

    public void setEndereco_residencial(String endereco_residencial) {
        this.endereco_residencial = endereco_residencial;
    }
    
    
    
}
