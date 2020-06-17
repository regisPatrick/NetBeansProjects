package br.com.regisprojects.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Computador", urlPatterns = {"/Computador"})
public class Computador extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Float total_combustivel = Float.parseFloat(request.getParameter("total_combustivel"));
        Float preco_litro = Float.parseFloat(request.getParameter("preco_litro"));
        Float consumo_medio = Float.parseFloat(request.getParameter("consumo_medio"));
        
        Float valor_gasto_abastecer = total_combustivel * preco_litro;
        Float distancia_maxima = total_combustivel * consumo_medio;
        
        request.setAttribute("valor_gasto_abastecer", valor_gasto_abastecer);
        request.setAttribute("distancia_maxima", distancia_maxima);
        
        request.getRequestDispatcher("computador.jsp").forward(request, response);
        
    }

}
