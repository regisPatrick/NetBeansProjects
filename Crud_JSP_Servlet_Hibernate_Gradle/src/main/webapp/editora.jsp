<%-- 
    Document   : editora
    Created on : 19 de out de 2019, 22:54:12
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
        <h1>Tela de Cadastro de Editora</h1>
        
        <input type="button" name="ir_para_editora_cadastrar" onclick="document.location.href='<%="editora_cadastrar.jsp" %>'" value="Ir para Cadastrar Editora"/>
        <input type="button" name="ir_para_editora_alterar" onclick="document.location.href='<%="editora_alterar.jsp" %>'" value="Ir para Alterar Editora"/>
        <input type="button" name="ir_para_editora_excluir" onclick="document.location.href='<%="editora_excluir.jsp" %>'" value="Ir para Excluir Editora"/>
        <input type="button" name="ir_para_editora_consulta_id" onclick="document.location.href='<%="editora_consultar_id.jsp" %>'" value="Ir para Consultar Editora por ID"/>
        <input type="button" name="ir_para_editora_consulta_todos" onclick="document.location.href='<%="editora_consultar_todos.jsp" %>'" value="Ir para Consultar todas Editoras"/><br/><br/>
        
        
        <input type="button" name="ir_para_tela_inicial" onclick="document.location.href='<%="index.jsp" %>'" value="Ir para página inicial"/>
        
    </body>
</html>
