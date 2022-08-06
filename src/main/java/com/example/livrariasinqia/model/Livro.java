package com.example.livrariasinqia.model;

import lombok.Data;

@Data
public class Livro {

    private Long id;
    private String nome;
    private String autor;

    public Livro(String nome, String autor) {

        this.nome = nome;

        this.autor = autor;
    }

}
