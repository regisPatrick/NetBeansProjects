<%-- 
    Document   : exclusao
    Created on : 26 de out de 2019, 10:05:11
    Author     : user
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="resources/css/style.css"/>" rel="stylesheet" type="text/css"/>
        <title>Consulta</title>
    </head>
    <body>
        <div class="container">
            <div class="col-md-6 cadastro">
                <h1>Tela de Consulta de todos os Registros</h1>
                <form action="lista" method="post">
                    
                    <div class="form-group">
                        <input type="submit" id="submit" class="btn btn-primary" value="Consulta todos"/>
                    </div>   
                    
                </form>
            </div>
        </div>
    </body>
</html>
