package com.example.livrariasinqia.acoes;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.example.livrariasinqia.dao.LivroDAOImpl.bancoLivro;

@WebServlet(value = "/livro-servlet-remover")
public class LivroServletRemover extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        System.out.println("O método de deletar está sendo chamado");
        String nome = request.getParameter("nome");

        for (int i = 0; i < bancoLivro.size(); i++) {
            if (bancoLivro.get(i).getNome().equals(nome)){
                bancoLivro.remove(i);
            }
        }

        request.setAttribute("livros", bancoLivro);

        RequestDispatcher Dispatcher = request.getRequestDispatcher("listar-livro.jsp");
        Dispatcher.forward(request, response);
    }


}