/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.dao;

import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.connectionfactory.ConnectionFactory;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.model.bean.Revista;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author user
 */
public class RevistaDAO extends GenericoDAO<Revista>{
       
    public List<Revista> findAll(){
        
        EntityManager em = new ConnectionFactory().getConnection();
        List<Revista> revistas = null;
        
        try {
            
            revistas = em.createQuery("from Revista r").getResultList();
            
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return revistas;
        
    }

}
