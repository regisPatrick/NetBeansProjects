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
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "EditorServletConsultarTodos", urlPatterns = {"/EditorServletConsultarTodos"})
public class EditorServletConsultarTodos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Editora</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Tela de Consulta de todas Editoras</h1>");
                Editor ed = new Editor();
                EditorDAO edao = new EditorDAO();
                Editora ed1 = new Editora();
                List<Editor> editores = new ArrayList<Editor>();
        
                editores = edao.findAll();
                out.println("-Id-----Nome----Idade------Setor----Id_Editora---Nome_Editora-");
                out.println("<br/>");
                out.println("*-------------------------------------------------------------*");
                out.println("<br/>");
                for(int x = 0; x < editores.size(); x++){
                    ed = editores.get(x);
                    out.print(ed.getId());
                    out.print("  -  ");
                    out.print(ed.getNome());
                    out.print("  -  ");
                    out.print(ed.getIdade());
                    out.print("  -  ");
                    out.print(ed.getSetor());
                    out.print("  -  ");
                    out.print(ed.getEditora().getId());
                    out.print("  -  ");
                    out.print(ed.getEditora().getNome());
                    out.println("<br/>");
                    out.println("*----------------------------------------------------------*");
                    out.println("<br/>");
                }
                    
  
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
