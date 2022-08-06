package com.example.livrariasinqia.ob;

import com.example.livrariasinqia.model.Livro;

import java.util.List;

public interface LivroBusinessObjectI {

    Livro save(Livro livro);

    List<Livro> findAll();

}