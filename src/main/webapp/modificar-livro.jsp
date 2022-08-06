<%--
  Created by IntelliJ IDEA.
  User: jonat
  Date: 06/08/2022
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modificar um livros</title>
    <br>
</head>
<body>
<h1>Modificar um livros</h1>
<br>
<fieldset>
    <legend>Digite o nome do livro que deseja modificar</legend>
    <form action="livro-servlet-modificar" method="post">
        <div>
            <label for="idNome"> Nome:</label>
            <input type="text" id="idNome" name="nome">
            <br>
        </div>
        <legend>Digite o novo nome do livro que deseja modificar</legend>
        <div>
            <label for="idNovoNome">Novo Nome:</label>
            <input type="text" id="idNovoNome" name="novoNome">
            <br>
        </div>
        <legend>Digite o novo autor do livro que deseja modificar</legend>
        <div>
            <label for="idNovoAutor"> Novo Autor:</label>
            <input type="text" id="idNovoAutor" name="novoAutor">
            <br>
        </div>
        <input type="submit"value="Enviar">
    </form>
</fieldset>
</body>
</html>
