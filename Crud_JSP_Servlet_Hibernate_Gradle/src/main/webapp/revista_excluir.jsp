<%-- 
    Document   : revista_excluir
    Created on : 21 de out de 2019, 23:11:32
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
            <h1>Tela de Exclusão de Revistas</h1>
        <form  method="post" action="RevistaServletExcluir">
            ID:
            <input type="text" name="id"/><br/>
        
            <input type="submit" name="excluir" value="Excluir Revista"/>
            
        </form>
       
        <input type="button" name="ir_para_tela_inicial" onclick="document.location.href='<%="index.jsp" %>'" value="Ir para página inicial"/>

    </body>
</html>

