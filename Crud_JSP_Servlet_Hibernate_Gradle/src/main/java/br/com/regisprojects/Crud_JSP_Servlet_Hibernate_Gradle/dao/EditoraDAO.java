/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.dao;

import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.connectionfactory.ConnectionFactory;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.model.bean.Editora;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author user
 */
public class EditoraDAO extends GenericoDAO<Editora>{
    
    public List<Editora> findAll(){
        
        EntityManager em = new ConnectionFactory().getConnection();
        List<Editora> editoras = null;
        
        try {
            
            editoras = em.createQuery("from Editora ed").getResultList();
            
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return editoras;
        
    }
}
