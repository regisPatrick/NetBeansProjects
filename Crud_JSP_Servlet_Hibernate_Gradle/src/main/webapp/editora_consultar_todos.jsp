<%-- 
    Document   : editora_consultar_todos
    Created on : 19 de out de 2019, 23:04:25
    Author     : user
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.model.bean.Editora"%>
<%@page import="br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.dao.EditoraDAO"%>
<%@page import="br.com.regisprojects.Crud_JSP_Servlet_Hibernate_Gradle.servlet.EditoraServletConsultarTodos"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Editora</title>
    </head>
    
        <h1>Tela de Consulta de Todas Editoras</h1>
        <form  method="post" action="EditoraServletConsultarTodos">

            <input type="submit" name="consultartodos" value="Consultar Todos"/>
            
        </form>
          
        <input type="button" name="ir_para_tela_inicial" onclick="document.location.href='<%="index.jsp" %>'" value="Ir para página inicial"/>

    
</html>
