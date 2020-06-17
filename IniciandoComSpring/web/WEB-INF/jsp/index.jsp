<%-- 
    Document   : index
    Created on : 22 de out de 2019, 23:06:27
    Author     : user
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
        <title>Inclui Cadastro</title>
    </head>
    <body>
        <h1>Olá ${nome}, obrigado por cadastrar!!!</h1>
        
        <form action="retorna_tela_principal" method="post">
            <div class="form-group">
                <input type="submit" id="submit" class="btn btn-primary" value="Retorna Para a Tela Principal"/>
            </div>
        </form>
    </body>
</html>
