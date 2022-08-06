package com.example.livrariasinqia.acoes;

import com.example.livrariasinqia.model.Livro;
import com.example.livrariasinqia.ob.LivroBusinessObjectI;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/livro-servlet")
public class LivroServlet extends HttpServlet {

    private LivroBusinessObjectI livroBusinessObjectI;

    @Inject
    public LivroServlet(LivroBusinessObjectI livroBusinessObjectI){
        this.livroBusinessObjectI = livroBusinessObjectI;
    }


    @Override
    public void init() {
        System.out.println("Inciando Servlet");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("O método está sendo chamado");
        String nome = request.getParameter("nome");
        String autor = request.getParameter("autor");


        Livro livro = new Livro(nome, autor);
        Livro livroSalva = livroBusinessObjectI.save(livro);

        request.setAttribute("idLivroSalvo", livroSalva.getId());

        List<Livro> livros = livroBusinessObjectI.findAll();

        request.setAttribute("livros", livros);


        RequestDispatcher Dispatcher = request.getRequestDispatcher("listar-livro.jsp");
        Dispatcher.forward(request, response);

    }
}