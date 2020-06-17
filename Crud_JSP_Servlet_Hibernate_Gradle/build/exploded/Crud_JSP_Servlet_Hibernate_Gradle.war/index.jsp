<%-- 
    Document   : index
    Created on : 18 de out de 2019, 00:26:15
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Sistema de Banca de Revistas</title>
        <style>
            form{
                background: bisque;
            }
            h1{
                font: normal Arial; 
                size: 30px;
                background: aqua;
            }
        </style>
    </head>
    <body>
        <h1>Bem vindo ao sistema de banca de revistas</h1>
        <form>
            <br/>
            <h2>Escolha para qual página você deseja ir</h2>
            <input type="button" name="ir_para_editor" onclick="document.location.href='<%="editor.jsp" %>'" value="Ir para Editor"/>
            <input type="button" name="ir_para_editora" onclick="document.location.href='<%="editora.jsp" %>'" value="Ir para Editora"/>
            <input type="button" name="ir_para_revista" onclick="document.location.href='<%="revista.jsp" %>'" value="Ir para Revista"/>
        </form>
    </body>
</html>
