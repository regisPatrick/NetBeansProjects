/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.dao;


import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.connectionfactory.ConnectionFactory;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.model.bean.I_EntidadeBase;
import javax.persistence.EntityManager;

/**
 *
 * @author user
 * @param <T>
 */
public class GenericoDAO<T extends I_EntidadeBase> {

    public T save(T t){
        
        EntityManager em = new ConnectionFactory().getConnection();
                
        try {
            em.getTransaction().begin();
            if(t.getId() == null){
                em.persist(t);
            }else{
                em.merge(t);
            }
            em.getTransaction().commit();  
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return t;
    }
    
    public T findById(Class<T> clazz, Integer id){

        EntityManager em = new ConnectionFactory().getConnection();
        T t = null;
        
        try {
            t = em.find(clazz, id);
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return t;
    }
        
    public T remove(Class<T> clazz, Integer id){
        
        EntityManager em = new ConnectionFactory().getConnection();
        T t = null;       
        
        try {
            
            t = em.find(clazz, id);
            
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return t;
    }
    
}
