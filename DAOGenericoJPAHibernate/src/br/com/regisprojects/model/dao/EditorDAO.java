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
public class EditorDAO extends GenericoDAO<Editor>{
    
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
    
}
