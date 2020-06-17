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
public class LivroDAO {
    
    public Livro save(Livro livro){
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try{
            em.getTransaction().begin();
            if(livro.getId() == null){
                em.persist(livro);
            }else{
                em.merge(livro);
            }
            
            em.getTransaction().commit();
            
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        
        return livro;
    }
    
    public Livro findById(Integer id){
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        Livro livro = null;
        
        try {
            
            livro = em.find(Livro.class, id);
        
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return livro;
        
    }
    
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
    
    public Livro remove(Integer id){
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        Livro livro = null;
        
        try {
            
            livro = em.find(Livro.class, id);
            
            em.getTransaction().begin();
            em.remove(livro);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        
        return livro;
        
    } 
    
}
