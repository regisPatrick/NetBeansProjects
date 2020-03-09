<%-- 
    Document   : exibir
    Created on : 25 de out de 2019, 13:38:08
    Author     : user
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
        <title>Consulta</title>
    </head>
    <body>
        <h1 style="text-align: center">Tela de exibição do registro consultado</h1>
        <div class="container">
            
            <table class="table">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Nome</th>
                        <th>Endereco</th>
                        <th>Telefone</th>
                        <th>E-mail</th>
                    </tr>
                </thead>
                
                <tbody>
                    
                        
                        <tr>
                            <td>${cadastro.id}</td>
                            <td>${cadastro.nome}</td>
                            <td>${cadastro.endereco}</td>
                            <td>${cadastro.telefone}</td>
                            <td>${cadastro.email}</td>
                        </tr>
                        
                    
                </tbody>
            </table>
            
        </div>
                        
        <form action="retorna_tela_principal" method="post">
            <div class="form-group">
                <input type="submit" id="submit" class="btn btn-primary" value="Retorna Para a Tela Principal"/>
            </div>
        </form>
                        
    </body>
</html>
