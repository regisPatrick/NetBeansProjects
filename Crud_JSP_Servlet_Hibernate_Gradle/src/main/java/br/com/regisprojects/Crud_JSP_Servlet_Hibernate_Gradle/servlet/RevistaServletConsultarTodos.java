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
@WebServlet(name = "RevistaServletConsultarTodos", urlPatterns = {"/RevistaServletConsultarTodos"})
public class RevistaServletConsultarTodos extends HttpServlet {

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
                Revista r = new Revista();
                RevistaDAO rdao = new RevistaDAO();
                Revista r1 = new Revista();
                List<Revista> revistas = new ArrayList<Revista>();
        
                revistas = rdao.findAll();
                out.println("-Id-----Nome----Categoria------Qtde_Paginas-----Preco-----Id_Editora---Nome_Editora-");
                out.println("<br/>");
                out.println("*----------------------------------------------------------------------------------*");
                out.println("<br/>");
                for(int x = 0; x < revistas.size(); x++){
                    r = revistas.get(x);
                    out.print(r.getId());
                    out.print("  -  ");
                    out.print(r.getNome());
                    out.print("  -  ");
                    out.print(r.getCategoria());
                    out.print("  -  ");
                    out.print(r.getQtde_paginas());
                    out.print("  -  ");
                    out.print(r.getPreco());
                    out.print("  -  ");
                    out.print(r.getEditora().getId());
                    out.print("  -  ");
                    out.print(r.getEditora().getNome());
                    out.println("<br/>");
                    out.println("*--------------------------------------------------------------------------------*");
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
