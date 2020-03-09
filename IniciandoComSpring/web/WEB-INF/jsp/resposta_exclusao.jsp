<%-- 
    Document   : resposta_exclusao
    Created on : 26 de out de 2019, 10:27:53
    Author     : user
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
        <title>Página de Confirmação de Exclusão</title>
    </head>
    <body>
        <h1>O Cadastro com o id ${id} foi excluído com sucesso!!!</h1>
        
        <form action="retorna_tela_principal" method="post">
            <div class="form-group">
                <input type="submit" id="submit" class="btn btn-primary" value="Retorna Para a Tela Principal"/>
            </div>
        </form>
    </body>
</html>
