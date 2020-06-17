/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.model.dao;

import br.com.regisprojects.connection.ConnectionFactory;
import br.com.regisprojects.model.bean.Editor;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author user
 */
public class EditorDAO {

    public Editor save(Editor editor){
        
        EntityManager em = new ConnectionFactory().getConnection();
                
        try {
            em.getTransaction().begin();
            if(editor.getId() == null){
                em.persist(editor);
            }else{
                em.merge(editor);
            }
            em.getTransaction().commit();  
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return editor;
    }
    
    public Editor findById(Integer id){

        EntityManager em = new ConnectionFactory().getConnection();
        Editor editor = null;
        
        try {
            editor = em.find(Editor.class, id);
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return editor;
    }
    
    public List<Editor> findAll(){
        
        EntityManager em = new ConnectionFactory().getConnection();
        List<Editor> editores = null;
        
        try {
            
            editores = em.createQuery("from Editor e").getResultList();
            
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return editores;
        
    }
    
    public Editor remove(Integer id){
        
        EntityManager em = new ConnectionFactory().getConnection();
        Editor editor = null;       
        
        try {
            
            editor = em.find(Editor.class, id);
            
            em.getTransaction().begin();
            em.remove(editor);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return editor;
    }
    
}
