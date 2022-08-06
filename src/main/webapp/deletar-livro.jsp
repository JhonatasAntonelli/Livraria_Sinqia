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
    <title>Deletar um livros</title>
</head>
<br>
<body>
<h1>Deletar um livros</h1>
<br>
<fieldset>
    <legend>Digite o nome do livro que deseja deletar</legend>
    <br>
    <form action="livro-servlet-remover" method="post">
        <br>
        <div>
            <label for="idNome"> Nome:</label>
            <br>
            <input type="text" id="idNome" name="nome">
            <br>
        </div>
        <input type="submit"value="Enviar">
    </form>
</fieldset>
</body>
</html>
