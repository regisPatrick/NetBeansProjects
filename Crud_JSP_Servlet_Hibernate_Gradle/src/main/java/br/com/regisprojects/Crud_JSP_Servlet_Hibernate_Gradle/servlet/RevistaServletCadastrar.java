/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.servlet;

import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.dao.EditorDAO;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.dao.RevistaDAO;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.model.bean.Editor;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.model.bean.Editora;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.model.bean.Revista;
import java.io.IOException;
import java.io.PrintWriter;
import javassist.expr.Cast;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "RevistaServletCadastrar", urlPatterns = {"/RevistaServletCadastrar"})
public class RevistaServletCadastrar extends HttpServlet {

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
     
        RevistaDAO rdao = new RevistaDAO();
          
        
        
        Revista r = new Revista();
        Editora ed = new Editora();
        
        Integer id_editora = Integer.parseInt(request.getParameter("editora"));
        ed.setId(id_editora);
        
        r.setId(null);
        r.setNome(request.getParameter("nome"));
        r.setCategoria(request.getParameter("categoria"));
        r.setQtde_paginas(Integer.parseInt(request.getParameter("qtde_paginas")));
        r.setPreco(Float.parseFloat(request.getParameter("preco")));
        r.setEditora(ed);
        
        rdao.save(r);
        
        request.getRequestDispatcher("revista_cadastrar.jsp").forward(request, response);
    }
    
    
}
