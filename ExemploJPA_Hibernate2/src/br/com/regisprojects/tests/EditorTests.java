/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.tests;

import br.com.regisprojects.connection.ConnectionFactory;
import br.com.regisprojects.model.bean.Editor;
import br.com.regisprojects.model.dao.EditorDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class EditorTests {
    
    public static void main(String[] args) {
        
        /*Editor e = new Editor(); // Insert e Update
        e.setId(7);
        e.setNome("Daniel Lopes");
        
        EditorDAO dao = new EditorDAO();
        e = dao.save(e);
        
        System.out.println("ID: " + e.getId());
        System.out.println("Nome: "+ e.getNome());*/
        
       /* EditorDAO dao = new EditorDAO(); // Consulta pelo id
        Editor e = dao.findById(5);
        
        System.out.println("Descrição: " + e.getNome());*/
        
       /*EditorDAO dao = new EditorDAO(); // Consulta todos os registros da tabela e retorna uma lista
       
       for(Editor e: dao.findAll()){
           System.out.println("Id: " + e.getId() + " " + "-" +" Nome: " + e.getNome());
       }*/
       
       EditorDAO dao = new EditorDAO();
       
       Editor e = dao.remove(6);
       System.out.println("Removido da tabela o editor: " + e.getNome());
       
    }
    
}
