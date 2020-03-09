/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.controle;

import br.com.regisprojects.dao.EstadoDAO;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author user
 */
@Named(value = "controleEstado")
@RequestScoped
public class ControleEstado implements Serializable{
    
    @EJB
    private EstadoDAO dao;

    public ControleEstado() {
    }
    
    public EstadoDAO getDao() {
        return dao;
    }

    public void setDao(EstadoDAO dao) {
        this.dao = dao;
    }
    
}
