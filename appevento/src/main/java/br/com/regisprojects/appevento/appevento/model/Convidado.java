/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.appevento.appevento.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author user
 */
@Entity
public class Convidado {
    
    @Id
    @NotEmpty
    private String rg;
    
    @NotEmpty
    private String nomeconvidado;
    
    @ManyToOne
    private Evento evento;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNomeconvidado() {
        return nomeconvidado;
    }

    public void setNomeconvidado(String nomeconvidado) {
        this.nomeconvidado = nomeconvidado;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    
}