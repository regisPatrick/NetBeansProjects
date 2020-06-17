/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.servlet;

import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.dao.EditoraDAO;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.model.bean.Editora;
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
@WebServlet(name = "EditoraServletExcluir", urlPatterns = {"/EditoraServletExcluir"})
public class EditoraServletExcluir extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Editora ed = new Editora();
        EditoraDAO eddao = new EditoraDAO();
          
        ed.setId(Integer.parseInt(request.getParameter("id")));
        ed.setNome(request.getParameter(null));
        eddao.remove(Editora.class, ed.getId());
        
        request.getRequestDispatcher("editora_excluir.jsp").forward(request, response);
    }
}