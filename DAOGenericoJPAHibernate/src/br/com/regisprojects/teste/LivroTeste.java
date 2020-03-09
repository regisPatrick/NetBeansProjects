/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.teste;

import br.com.regisprojects.model.bean.Editor;
import br.com.regisprojects.model.bean.Livro;
import br.com.regisprojects.model.dao.LivroDAO;

/**
 *
 * @author user
 */
public class LivroTeste {
    
    public static void main(String[] args) {
        
       Livro l = new Livro();
       Editor e = new Editor();
//       e.setId(4);

       LivroDAO dao = new LivroDAO();
       
/*       l.setId(14);
       l.setDescricao("Watchmen");
       l.setQtde(430);
       l.setValor(99.90);
       l.setEditor(e);
       
       dao.save(l);*/
 /*      Livro l1 = null;
       l1 = dao.remove(Livro.class, 14);
       
       System.out.println("O Livro deletado foi o: " + l1.getDescricao());*/
       
 /*      l = dao.findById(Livro.class, 9);
       
       System.out.println("O livro retornado pela consulta foi: " + l.getDescricao());*/
 
       for(Livro l1: dao.findAll()){
           System.out.println("Id: " + l1.getId() + " " + "-" +" Descrição: " + l1.getDescricao() + " " + "Quantidade: " + l1.getQtde() +
                   " " + "Valor: R$" + l1.getValor() + " " + "Editor: " + l1.getEditor().getNome());
       }
       
    }
    
}
