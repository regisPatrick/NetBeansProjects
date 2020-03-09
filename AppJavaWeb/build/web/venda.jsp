<%-- 
    Document   : venda
    Created on : 4 de out de 2019, 09:29:10
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
        <form method="post" action="Venda">
            Nome do produto:<br>
            <input type="text" name="produto"><br>
            Quantidade:<br>
            <input type="text" name="quantidade"><br>
            Valor:<br>
            <input type="text" name="valor"><br><br>
            <input type="submit" value="calcular">
        </form>
    </body>
</html>
