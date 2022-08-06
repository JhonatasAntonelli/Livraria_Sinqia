package com.example.livrariasinqia.ob;

import com.example.livrariasinqia.dao.LivroDAOImpl;
import com.example.livrariasinqia.model.Livro;

import javax.inject.Inject;
import java.util.List;
import java.util.Objects;

public class LivroBusinessObjectImpl implements LivroBusinessObjectI{

    private LivroDAOImpl livroDAOImpl;

    @Inject
    public LivroBusinessObjectImpl(LivroDAOImpl livroDAOImpl){
        this.livroDAOImpl = livroDAOImpl;
    }
    private void valida (Livro livro){
        if (Objects.isNull(livro.getNome())){
            throw new IllegalArgumentException("Nome invalido");
        }
    }
    @Override
    public Livro save(Livro livro) {
        valida(livro);
        return livroDAOImpl.save(livro);
    }
    @Override
    public List<Livro> findAll() {
        return livroDAOImpl.findAll();
    }
}

