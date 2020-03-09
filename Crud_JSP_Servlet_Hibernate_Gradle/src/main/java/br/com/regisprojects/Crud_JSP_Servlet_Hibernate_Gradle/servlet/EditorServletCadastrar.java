/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.servlet;

import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.dao.EditorDAO;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.model.bean.Editor;
import br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.model.bean.Editora;
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
@WebServlet(name = "EditorServletCadastrar", urlPatterns = {"/EditorServletCadastrar"})
public class EditorServletCadastrar extends HttpServlet {

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
     
        EditorDAO edao = new EditorDAO();
          
        
        
        Editor e = new Editor();
        Editora ed = new Editora();
        
        Integer id_editora = Integer.parseInt(request.getParameter("editora"));
        ed.setId(id_editora);
        
        e.setId(null);
        e.setNome(request.getParameter("nome"));
        e.setIdade(Integer.parseInt(request.getParameter("idade")));
        e.setSetor(request.getParameter("setor"));
        e.setEditora(ed);
        
        edao.save(e);
        
        request.getRequestDispatcher("editor_cadastrar.jsp").forward(request, response);
    }
    
    
}
