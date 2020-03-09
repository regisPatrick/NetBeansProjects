<%-- 
    Document   : computador
    Created on : 5 de out de 2019, 16:30:39
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Computador de Bordo</title>
    </head>
    <body>
        <h1>Resultado do Cálculo</h1>
        <form>
            Distância máxima
            <input type="text" size="10" value="<%= request.getAttribute("distancia_maxima")%>"><br><br>
            Valor gasto para abastecer
            <input type="text" size="10" value="<%= request.getAttribute("valor_gasto_abastecer")%>"><br><br>
            <input type="button" value="Retornar" onclick="history.back()">
        </form>
    </body>
</html>
