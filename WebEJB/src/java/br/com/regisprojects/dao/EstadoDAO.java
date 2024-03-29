/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.dao;

import br.com.regisprojects.modelo.Estado;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class EstadoDAO implements Serializable{
    
    @PersistenceContext(unitName = "WebEJBPU")
    private EntityManager em;
    
    private List<Estado> listaObjetos;

    public EstadoDAO() {
    }
    
    public List<Estado> getListaObjetos() {
        return em.createQuery("from Estado order by nome").getResultList();
    }
    
    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void setListaObjetos(List<Estado> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }
    
}
