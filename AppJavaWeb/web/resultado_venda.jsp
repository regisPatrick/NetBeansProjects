<%-- 
    Document   : resultado_venda
    Created on : 5 de out de 2019, 09:59:04
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado da venda do produto</title>
    </head>
    
        <h1>Venda de Produto</h1>
        <%
            String nome_produto = request.getParameter("produto");
            Integer quantidade_produto = Integer.parseInt(request.getParameter("quantidade"));
            Float valor_unitaro_produto = Float.parseFloat(request.getParameter("valor_unitario"));
            
            out.print("Nome do produto: " + nome_produto + "<br>");
            out.print("Valor unitário do produto: " + valor_unitaro_produto + "<br>");
            out.print("Quantidade do produto: " + quantidade_produto + "<br>");
            out.print("Valor total do produto: " + (valor_unitaro_produto * quantidade_produto));
        %>
    </body>

