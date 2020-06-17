<%-- 
    Document   : revista_consultar_todos
    Created on : 21 de out de 2019, 23:12:47
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Revista</title>
    </head>
    <body>
        <h1>Tela de Consulta de Todas Revistas</h1>
        <form  method="post" action="RevistaServletConsultarTodos">

            <input type="submit" name="consultartodos" value="Consultar Todos"/>
            
        </form>
          
        <input type="button" name="ir_para_tela_inicial" onclick="document.location.href='<%="index.jsp" %>'" value="Ir para página inicial"/>

    
</html>
