<%-- 
    Document   : editor_consultar_todos
    Created on : 20 de out de 2019, 19:46:32
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Editor</title>
    </head>
    <body>
        <h1>Tela de Consulta de Todos Editores</h1>
        <form  method="post" action="EditorServletConsultarTodos">

            <input type="submit" name="consultartodos" value="Consultar Todos"/>
            
        </form>
          
        <input type="button" name="ir_para_tela_inicial" onclick="document.location.href='<%="index.jsp" %>'" value="Ir para página inicial"/>

    
</html>
