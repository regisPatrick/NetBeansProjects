<%-- 
    Document   : editor_consultar_id
    Created on : 20 de out de 2019, 19:46:00
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
      <h1>Tela de Consulta de Editores por ID</h1>
        <form  method="post" action="EditorServletConsultarId">
            ID:
            <input type="text" name="id"/><br/>
            Nome do Editor:
            <input type="text" name="nome"/><br/>

            <input type="submit" name="consultarid" value="Consultar por ID"/>
            
        </form>
        
        
        Id:
        <input type="text" size="10" value="<%= request.getAttribute("id")%>"><br><br>
        Nome:
        <input type="text" size="10" value="<%= request.getAttribute("nome")%>"><br><br>
        Idade:
        <input type="text" size="10" value="<%= request.getAttribute("idade")%>"><br><br>
        Setor:
        <input type="text" size="10" value="<%= request.getAttribute("setor")%>"><br><br>
        Editora Id:
        <input type="text" size="10" value="<%= request.getAttribute("id_editora")%>"><br><br>
        Editora Nome:
        <input type="text" size="10" value="<%= request.getAttribute("nome_editora")%>"><br><br>
        
        <input type="button" name="ir_para_tela_inicial" onclick="document.location.href='<%="index.jsp" %>'" value="Ir para página inicial"/>

    </body>
</html>
