<%-- 
    Document   : Revistas
    Created on : 18 de out de 2019, 16:44:40
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Revista</title>
        <style>
            body{
                background: yellow;
                font: normal 15pt Arial;              
                
            }
            h1{
                background: aqua;
                font: normal 40pt Arial;
            }
        </style>    
    </head>
    <body>
        <h1>Tela de Cadastro de Revista</h1>
        
        <input type="button" name="ir_para_revista_cadastrar" onclick="document.location.href='<%="revista_cadastrar.jsp" %>'" value="Ir para Cadastrar Revista"/>
        <input type="button" name="ir_para_revista_alterar" onclick="document.location.href='<%="revista_alterar.jsp" %>'" value="Ir para Alterar Revista"/>
        <input type="button" name="ir_para_revista_excluir" onclick="document.location.href='<%="revista_excluir.jsp" %>'" value="Ir para Excluir Revista"/>
        <input type="button" name="ir_para_revista_consulta_id" onclick="document.location.href='<%="revista_consultar_id.jsp" %>'" value="Ir para Consultar Revista por ID"/>
        <input type="button" name="ir_para_revista_consulta_todos" onclick="document.location.href='<%="revista_consultar_todos.jsp" %>'" value="Ir para Consultar todas Revistas"/><br/><br/>
        
        
        <input type="button" name="ir_para_tela_inicial" onclick="document.location.href='<%="index.jsp" %>'" value="Ir para página inicial"/>
    </body>
</html>
