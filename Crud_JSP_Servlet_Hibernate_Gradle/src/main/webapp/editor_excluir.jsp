<%-- 
    Document   : editor_excluir
    Created on : 20 de out de 2019, 19:45:33
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
    <h1>Tela de Exclusão de Editores</h1>
        <form  method="post" action="EditorServletExcluir">
            ID:
            <input type="text" name="id"/><br/>
        
            <input type="submit" name="excluir" value="Excluir Editor"/>
            
        </form>
       
        <input type="button" name="ir_para_tela_inicial" onclick="document.location.href='<%="index.jsp" %>'" value="Ir para página inicial"/>

    </body>
</html>

