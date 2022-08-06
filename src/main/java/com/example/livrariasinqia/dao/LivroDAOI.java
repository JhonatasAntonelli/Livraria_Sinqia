package com.example.livrariasinqia.dao;

import com.example.livrariasinqia.model.Livro;

import java.util.List;

public interface LivroDAOI {

    Livro save(Livro livro);

    List<Livro> findAll();
}