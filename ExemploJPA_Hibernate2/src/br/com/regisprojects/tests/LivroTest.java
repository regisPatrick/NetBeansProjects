/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.tests;

import br.com.regisprojects.model.bean.Editor;
import br.com.regisprojects.model.bean.Livro;
import br.com.regisprojects.model.dao.LivroDAO;

/**
 *
 * @author user
 */
public class LivroTest {
    
    public static void main(String[] args) {
        
       /* LivroDAO dao = new LivroDAO();  // Esse codigo para insert e update
        
        Editor editor = new Editor();
        editor.setId(5);
        
        Livro livro = new Livro();
        //livro.setId(8); //Coloco esta linha para fazer uma atualização
        livro.setDescricao("O anel do nibelungo");
        livro.setQtde(569);
        livro.setValor(40.00);
        livro.setEditor(editor);
        
        dao.save(livro);*/
        
       /*LivroDAO dao = new LivroDAO(); // Esse codigo é para fazer a busca pelo Id
       
       Livro livro = dao.findById(11);
       
        System.out.println("Descrição: " + livro.getDescricao());
        System.out.println("Quantidade: " + livro.getQtde());
        System.out.println("Valor: " + livro.getValor());
        System.out.println("Editor: " + livro.getEditor().getNome());*/
        
       /*LivroDAO dao = new LivroDAO();  // Codigo para retornar todos os registros
       
       for(Livro livro : dao.findAll()){
          System.out.println("Descrição: " + livro.getDescricao());
          System.out.println("Quantidade: " + livro.getQtde());
          System.out.println("Valor: " + livro.getValor());
          System.out.println("Editor: " + livro.getEditor().getNome());
       }*/
       
       LivroDAO dao = new LivroDAO();
       
       Livro livro = null;
       
       livro = dao.remove(12);
       
       System.out.println("O livro removido foi: " + livro.getDescricao());
       
    }
    
}
