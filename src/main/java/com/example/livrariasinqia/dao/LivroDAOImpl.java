package com.example.livrariasinqia.dao;

import com.example.livrariasinqia.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroDAOImpl implements LivroDAOI{

    public static List<Livro> bancoLivro = new ArrayList<>();
    private static long countLivro;

    @Override
    public Livro save(Livro livro) {
        countLivro++;
        livro.setId(countLivro);
        bancoLivro.add(livro);
        return livro;
    }
    @Override
    public List<Livro> findAll() {
        return bancoLivro;
    }
}