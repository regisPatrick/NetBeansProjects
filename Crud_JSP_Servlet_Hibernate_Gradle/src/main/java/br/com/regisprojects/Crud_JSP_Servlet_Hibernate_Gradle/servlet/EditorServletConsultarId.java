/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.servlet;

import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.dao.EditorDAO;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.dao.EditoraDAO;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.model.bean.Editor;
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
@WebServlet(name = "EditorServletConsultarId", urlPatterns = {"/EditorServletConsultarId"})
public class EditorServletConsultarId extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Editor ed = new Editor();
        EditorDAO edao = new EditorDAO();
        Editor ed1 = new Editor();
          
        ed.setId(Integer.parseInt(request.getParameter("id")));
        ed.setNome(request.getParameter(null));
        ed1 = edao.findById(Editor.class, ed.getId());
        
        Integer id = ed1.getId();
        String nome = ed1.getNome();
        Integer idade = ed1.getIdade();
        String setor = ed1.getSetor();
        Integer id_editora = ed1.getEditora().getId();
        String nome_editora = ed1.getEditora().getNome();
        
        request.setAttribute("id", id);
        request.setAttribute("nome", nome);
        request.setAttribute("idade", idade);
        request.setAttribute("setor", setor);
        request.setAttribute("id_editora", id_editora);
        request.setAttribute("nome_editora", nome_editora);
            
            
        request.getRequestDispatcher("editor_consultar_id.jsp").forward(request, response);
        
    }
}