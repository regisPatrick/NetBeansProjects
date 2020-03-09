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
        <title>Tela Principal</title>
    </head>
    <body>
        <div class="container">
            <div class="col-md-6 cadastro">
                <h1>Tela Principal - Cadastro</h1>
                <form action="inclusao" method="post">
                    
                    <div class="form-group">
                        <input type="submit" id="submit" class="btn btn-primary" value="Inserir Cadastro"/>
                    </div>   
                    
                </form>
                
                <form action="altera_cad" method="post">
                    
                    <div class="form-group">
                        <input type="submit" id="submit" class="btn btn-primary" value="Alterar Cadastro"/>
                    </div>   
                    
                </form>
                
                <form action="apagar" method="post">
                    
                    <div class="form-group">
                        <input type="submit" id="submit" class="btn btn-primary" value="Excluir Cadastro"/>
                    </div>   
                    
                </form>
                
                <form action="cons_por_id" method="post">
                    
                    <div class="form-group">
                        <input type="submit" id="submit" class="btn btn-primary" value="Consulta por Id"/>
                    </div>   
                    
                </form>
                
                <form action="cons_todos" method="post">
                    
                    <div class="form-group">
                        <input type="submit" id="submit" class="btn btn-primary" value="Consulta todos Cadastros"/>
                    </div>   
                    
                </form>
            </div>
        </div>
    </body>
</html>
