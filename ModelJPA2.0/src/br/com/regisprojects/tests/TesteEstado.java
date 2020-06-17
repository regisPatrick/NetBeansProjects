/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.tests;

import br.com.regisprojects.jpa.EntityManagerUtil;
import br.com.regisprojects.modelo.Estado;
import javax.persistence.EntityManager;

/**
 *
 * @author user
 */
public class TesteEstado {
    
    public static void main(String[] args) {
        
        EntityManager em = EntityManagerUtil.getEntityManager();
        Estado e = new Estado();
        e.setNome("Rio de Janeiro");
        e.setUf("RJ");
        e.setPais("Brasil");
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        em.close();
    }
    
}
