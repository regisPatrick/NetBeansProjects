/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.model.dao;

import br.com.regisprojects.connection.ConnectionFactory;
import br.com.regisprojects.model.dominio.Cadastro;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author user
 */
public class CadastroDAO extends GenericoDAO<Cadastro>{
    
    public List<Cadastro> findAll(){
        
        EntityManager em = new ConnectionFactory().getConnection();
        List<Cadastro> cadastros = null;
        
        try {
            
            cadastros = em.createQuery("from Cadastro c").getResultList();
            
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return cadastros;
        
    }
    
}
