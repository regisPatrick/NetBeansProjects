/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

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
@WebServlet(name = "SegundoServlet", urlPatterns = {"/SegundoServlet"})
public class SegundoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SegundoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("Nome do Servlet..............: " + request.getContextPath() + "<br>");
            out.println("Nome da Maquina local........: " + request.getLocalName() + "<br>");
            out.println("Endereço da Maquina Local....: " + request.getLocalAddr() + "<br>");
            out.println("Porta da Maquina Local.......: " + request.getLocalPort() + "<br>");
            out.println("Endereço do Servidor.........: " + request.getRemoteHost() + "<br>");
            out.println("Porta do Servidor............: " + request.getRemotePort() + "<br>");
            out.println("Método de Requisiçao.........: " + request.getMethod() + "<br>");
            out.println("Protocolo Utilizado..........: " + request.getProtocol() + "<br>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
