/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.projetojsf_maven_hibernate.model.dao;

import br.com.regisprojects.projetojsf_maven_hibernate.connection.ConnectionFactory;
import br.com.regisprojects.projetojsf_maven_hibernate.model.entidades.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author user
 */
public class PessoaDAO extends GenericoDAO<Pessoa>{
    
    public List<Pessoa> findAll(){
        
        EntityManager em = new ConnectionFactory().getConnection();
        List<Pessoa> pessoas = null;
        
        try {
            
            pessoas = em.createQuery("from Pessoa p").getResultList();
            
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return pessoas;
        
    }
}
