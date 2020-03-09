/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.teste;

import br.com.regisprojects.model.bean.Editor;
import br.com.regisprojects.model.dao.EditorDAO;

/**
 *
 * @author user
 */
public class EditorTeste {
    
    public static void main(String[] args) {
         
        Editor e = new Editor();
//        e.setId(13);
//        e.setNome("Daniel Lopes");
        
        EditorDAO dao = new EditorDAO();
        
//        dao.save(e);
        
//        System.out.println("O Editor: " + e.getNome() + " foi salvo com sucesso no Banco de Dados!!!");
        
//        Editor e2 = dao.findById(Editor.class, 5);
        
//        System.out.println("O Editor retornado na pesquisa foi: " + e2.getNome());
        
//        Editor e3 = dao.remove(Editor.class, 13);
        
//        System.out.println("O Editor excluido foi: " + e3.getNome());
         

           for(Editor e1: dao.findAll()){
                System.out.println("Id: " + e1.getId() + " " + "-" +" Nome: " + e1.getNome());
       }
    }
    
}
