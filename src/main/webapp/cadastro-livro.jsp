<%--
  Created by IntelliJ IDEA.
  User: jonat
  Date: 06/08/2022
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro do livros</title>
</head>
<br>
<body>
<h1>Cadastro de livros</h1>
<fieldset>
    <br>
    <legend>Dados Basicos</legend>
    <form action="livro-servlet" method="post">
        <br>
        <div>
            <label for="idNome"> Nome:</label>
            <input type="text" id="idNome" name="nome">
        </div>
        <br>
        <div>
            <label for="idAutor"> Autor:</label>
            <input type="text" id="idAutor" name="autor">
        </div>
        <br>
        <input type="submit"value="Enviar">
    </form>
</fieldset>
</body>
</html>
