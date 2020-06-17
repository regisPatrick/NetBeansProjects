<%-- 
    Document   : Editora
    Created on : 18 de out de 2019, 16:43:53
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Editora</title>
    </head>
    <body>
        <h1>Tela de Consulta de Editoras por ID</h1>
        <form  method="post" action="EditoraServletConsultarId">
            ID:
            <input type="text" name="id"/><br/>
            
            <input type="submit" name="consultarid" value="Consultar por ID"/>
            
        </form>
        
        
        Id:
        <div><%= request.getAttribute("id")%></div><br><br>
        Nome:
        <div><%= request.getAttribute("nome")%></div><br><br>
        
        <input type="button" name="ir_para_tela_inicial" onclick="document.location.href='<%="index.jsp" %>'" value="Ir para página inicial"/>

    </body>
</html>
