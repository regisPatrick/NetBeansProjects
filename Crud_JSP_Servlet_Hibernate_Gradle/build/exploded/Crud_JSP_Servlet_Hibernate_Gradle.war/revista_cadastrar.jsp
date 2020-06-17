<%-- 
    Document   : revista_cadastrar
    Created on : 21 de out de 2019, 23:10:24
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
        <h1>Tela de Cadastro de Revistas</h1>
        <form  method="post" action="RevistaServletCadastrar">
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
            <input type="submit" name="cadastrar" value="Cadastrar"/>
        </form>
        
        <input type="button" name="ir_para_tela_inicial" onclick="document.location.href='<%="index.jsp" %>'" value="Ir para página inicial"/>
        
    </body>
</html>
