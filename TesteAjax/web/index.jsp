<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            function salvar(){
                var nome = $("input[name=nome]").val()
                $.post("salvar.jsp", {nome: nome}, function (data) {
                    $("#mensagem").html(data)
                })
                return false
            }
        </script>    
    </head>
    <body>
        <div id="mensagem">
        </div>    
        <form name="formulario" action="salvar.jsp" method="post" onsubmit="return salvar()">
            <label>Nome</label>
            <input type="text" name="nome" value=""/><br/>
            <input type="submit" name="enviar" value="Salvar"/>
        </form>    
    </body>
</html>
