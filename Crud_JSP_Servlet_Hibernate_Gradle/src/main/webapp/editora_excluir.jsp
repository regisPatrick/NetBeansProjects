<%-- 
    Document   : editora_excluir
    Created on : 19 de out de 2019, 23:03:54
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
    <h1>Tela de Exclusão de Editoras</h1>
        <form  method="post" action="EditoraServletExcluir">
            ID:
            <input type="text" name="id"/><br/>
            Nome da Editora:
            <input type="text" name="nome"/><br/>
            <input type="submit" name="excluir" value="Excluir Editora"/>
            
        </form>
       
        <input type="button" name="ir_para_tela_inicial" onclick="document.location.href='<%="index.jsp" %>'" value="Ir para página inicial"/>

    </body>
</html>

