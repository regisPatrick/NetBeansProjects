/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.model.dao;

import br.com.regisprojects.connection.ConnectionFactory;
import br.com.regisprojects.model.bean.Livro;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author user
 */
public class LivroDAO extends GenericoDAO<Livro>{
    
    public List<Livro> findAll(){
       
        EntityManager em = new ConnectionFactory().getConnection();
        List<Livro> livros = null;
        
        try {
            
            livros = em.createQuery("from Livro l").getResultList();
            
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return livros;
        
    }
    
   
}
