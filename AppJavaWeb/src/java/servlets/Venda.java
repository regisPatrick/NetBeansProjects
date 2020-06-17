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
@WebServlet(name = "Venda", urlPatterns = {"/Venda"})
public class Venda extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Float valor = Float.parseFloat(request.getParameter("valor"));
        Integer quantidade = Integer.parseInt(request.getParameter("quantidade"));
        Float valor_total = valor * quantidade;
        String produto = request.getParameter("produto");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado da Venda</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Venda do produto: " + produto + "</h1>");
            out.println("Total a pagar R$ " + valor_total);
            out.println("</body>");
            out.println("</html>");
        }
    }
}
