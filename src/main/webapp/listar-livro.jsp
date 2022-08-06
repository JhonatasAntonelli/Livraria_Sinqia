<%--
  Created by IntelliJ IDEA.
  User: jonat
  Date: 06/08/2022
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"	%>
<html>
<head>
    <title>Lista de Livros Cadastrados</title>
    <br>
</head>
<body>
<h1>Lista de livros cadastrados</h1>
<br>
<table border="solid">
    <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>Autor</th>
    </tr>
    <br>
    <c:forEach var="livro" items="${livros}" varStatus="nome">
        <tr>
            <th>${livro.id}</th>
            <th>${livro.nome}</th>
            <th>${livro.autor}</th>
        </tr>
    </c:forEach>
</table>
<br>
<a href="listar-livro.jsp"><button>Listar livros</button></a>
<br>
<br>
<a href="cadastro-livro.jsp"><button>Cadastro de livros</button></a>
<br>
<br>
<a href="modificar-livro.jsp"><button>Modificar livros</button></a>
<br>
<br>
<a href="deletar-livro.jsp"><button>Remover Livros</button></a>
</body>
</html>