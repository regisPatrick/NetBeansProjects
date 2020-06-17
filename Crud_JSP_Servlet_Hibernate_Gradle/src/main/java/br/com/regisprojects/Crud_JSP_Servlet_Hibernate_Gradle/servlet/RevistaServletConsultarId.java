/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.servlet;

import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.dao.EditorDAO;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.dao.EditoraDAO;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.dao.RevistaDAO;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.model.bean.Editor;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.model.bean.Editora;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.model.bean.Revista;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "RevistaServletConsultarId", urlPatterns = {"/RevistaServletConsultarId"})
public class RevistaServletConsultarId extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Revista r = new Revista();
        RevistaDAO rdao = new RevistaDAO();
        Revista r1 = new Revista();
          
        r.setId(Integer.parseInt(request.getParameter("id")));
        r.setNome(request.getParameter(null));
        r1 = rdao.findById(Revista.class, r.getId());
        
        Integer id = r1.getId();
        String nome = r1.getNome();
        String categoria = r1.getCategoria();
        Integer qtde_paginas = r1.getQtde_paginas();
        Float preco = r1.getPreco();
        Integer id_editora = r1.getEditora().getId();
        String nome_editora = r1.getEditora().getNome();
        
        request.setAttribute("id", id);
        request.setAttribute("nome", nome);
        request.setAttribute("categoria", categoria);
        request.setAttribute("qtde_paginas", qtde_paginas);
        request.setAttribute("preco", preco);
        request.setAttribute("id_editora", id_editora);
        request.setAttribute("nome_editora", nome_editora);
            
            
        request.getRequestDispatcher("revista_consultar_id.jsp").forward(request, response);
        
    }
}