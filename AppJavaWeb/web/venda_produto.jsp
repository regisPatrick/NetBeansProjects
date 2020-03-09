<%-- 
    Document   : venda_produto
    Created on : 5 de out de 2019, 09:44:52
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Venda de Mercadoria</title>
    </head>
    <body>
        <h1>Dados da Venda</h1>
        <form method="post" action="resultado_venda.jsp">
            Nome do produto:<br>
            <input type="text" name="produto"><br>
            Quantidade:<br>
            <input type="text" name="quantidade"><br>
            Valor Unitário:<br>
            <input type="text" name="valor_unitario"><br><br>
            <input type="submit" value="Calcular">
        </form>    
    </body> 
</html>
