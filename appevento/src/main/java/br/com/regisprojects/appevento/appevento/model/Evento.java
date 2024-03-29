/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.appevento.appevento.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author user
 */
@Entity
public class Evento implements Serializable{
    
    public static final long serialVersionUID = 1L;
            
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;
    
    @NotEmpty
    private String nome;
    
    @NotEmpty
    private String local;
    
    @NotEmpty
    private String data;
    
    @NotEmpty
    private String horario;
    
    @OneToMany
    private List<Convidado> convidado;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Convidado> getConvidado() {
        return convidado;
    }

    public void setConvidado(List<Convidado> convidado) {
        this.convidado = convidado;
    }
    
}
