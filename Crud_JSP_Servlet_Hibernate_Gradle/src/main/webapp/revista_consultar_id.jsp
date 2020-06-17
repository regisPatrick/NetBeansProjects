<%-- 
    Document   : revista_consultar_id
    Created on : 21 de out de 2019, 23:12:04
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
        <h1>Tela de Consulta de Revistas por ID</h1>
        <form  method="post" action="RevistaServletConsultarId">
            ID:
            <input type="text" name="id"/><br/>
            Nome do Editor:
            <input type="text" name="nome"/><br/>

            <input type="submit" name="consultarid" value="Consultar por ID"/>
            
        </form>
        
        
        Id:
        <div><%= request.getAttribute("id")%></div><br><br>
        Nome da Revista:
        <div><%= request.getAttribute("nome")%></div><br><br>
        Categoria:
        <div><%= request.getAttribute("categoria")%></div><br><br>
        Quantidade de Páginas:
        <div><%= request.getAttribute("qtde_paginas")%></div><br><br>
        Preço:
        <div><%= request.getAttribute("preco")%></div><br><br>
        Editora Id:
        <div><%= request.getAttribute("id_editora")%></div><br><br>
        Editora Nome:
        <div><%= request.getAttribute("nome_editora")%></div><br><br>
        
        <input type="button" name="ir_para_tela_inicial" onclick="document.location.href='<%="index.jsp" %>'" value="Ir para página inicial"/>

    </body>
</html>

