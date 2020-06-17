<%-- 
    Document   : editor_alterar
    Created on : 20 de out de 2019, 19:45:04
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
        <h1>Tela de Alteração de Editores</h1>
        <form  method="post" action="EditorServletAlterar">
            ID:
            <input type="text" name="id"/><br/>
            Nome:
            <input type="text" name="nome"/><br/>
            Idade:
            <input type="text" name="idade"/><br/>
            Setor:
            <input type="text" name="setor"/><br/>
            Editora:
            <input type="text" name="editora"/><br/>
            <input type="submit" value="Alterar" name="alterar"/>
        </form>
       
        <input type="button" name="ir_para_tela_inicial" onclick="document.location.href='<%="index.jsp" %>'" value="Ir para página inicial"/>

    </body>
</html>

