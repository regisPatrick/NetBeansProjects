/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.tests;

import br.com.regisprojects.model.bean.Editor;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class EditorTests {
    
    public static void main(String[] args) {
        
        Editor e = new Editor();
        e.setId(4);
        e.setNome("Jotape Martins");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
        
    }
    
}
