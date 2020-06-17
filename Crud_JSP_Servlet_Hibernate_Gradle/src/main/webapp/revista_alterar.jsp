<%-- 
    Document   : revista_alterar
    Created on : 21 de out de 2019, 23:11:05
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
        <h1>Tela de Alteração de Revistas</h1>
            <form  method="post" action="RevistaServletAlterar">
            ID:
            <input type="text" name="id"/><br/>
            Nome da Revista:
            <input type="text" name="nome"/><br/>
            Categoria:
            <input type="text" name="categoria"/><br/>
            Quantidade de Páginas:
            <input type="text" name="qtde_paginas"/><br/>
            Preço:
            <input type="text" name="preco"/><br/>
            Editora:
            <input type="text" name="editora"/><br/>
            <input type="submit" value="Alterar" name="alterar"/>
        </form>
       
        <input type="button" name="ir_para_tela_inicial" onclick="document.location.href='<%="index.jsp" %>'" value="Ir para página inicial"/>

    </body>
</html>

