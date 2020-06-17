<%-- 
    Document   : Editor
    Created on : 18 de out de 2019, 16:43:00
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
        
        <h1>Tela de Cadastro de Editor</h1>
        
        <input type="button" name="ir_para_editor_cadastrar" onclick="document.location.href='<%="editor_cadastrar.jsp" %>'" value="Ir para Cadastrar Editor"/>
        <input type="button" name="ir_para_editor_alterar" onclick="document.location.href='<%="editor_alterar.jsp" %>'" value="Ir para Alterar Editor"/>
        <input type="button" name="ir_para_editor_excluir" onclick="document.location.href='<%="editor_excluir.jsp" %>'" value="Ir para Excluir Editor"/>
        <input type="button" name="ir_para_editor_consulta_id" onclick="document.location.href='<%="editor_consultar_id.jsp" %>'" value="Ir para Consultar Editor por ID"/>
        <input type="button" name="ir_para_editor_consulta_todos" onclick="document.location.href='<%="editor_consultar_todos.jsp" %>'" value="Ir para Consultar todos Editores"/><br/><br/>
        
        
        <input type="button" name="ir_para_tela_inicial" onclick="document.location.href='<%="index.jsp" %>'" value="Ir para página inicial"/>

    </body>
</html>
