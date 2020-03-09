/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.controller;

import br.com.regisprojects.ejb.BeanDataHora;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author user
 */
@Named(value = "controleDataHora")
@RequestScoped
public class ControleDataHora implements Serializable{
    
    @EJB
    private BeanDataHora beanDataHora;
    @Inject
    private ControleUsuario controleUsuario;
    
    public ControleDataHora(){
        System.out.println("Criou a instância do controleDataHora");
    }
    
    public String getNomeUsuario(){
        return controleUsuario.getBeanUsuario().getUsuario() != null ?
                controleUsuario.getBeanUsuario().getUsuario() : "Usuário não informado!";
    }

    public BeanDataHora getBeanDataHora() {
        return beanDataHora;
    }

    public void setBeanDataHora(BeanDataHora beanDataHora) {
        this.beanDataHora = beanDataHora;
    }

    public ControleUsuario getControleUsuario() {
        return controleUsuario;
    }

    public void setControleUsuario(ControleUsuario controleUsuario) {
        this.controleUsuario = controleUsuario;
    }
    
}