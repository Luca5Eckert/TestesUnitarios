package com.estudo.testes.model;

import java.util.UUID;

public class Aluno extends Pessoa{

    private int serie;

    public Aluno(UUID id, Nome nome, Email email, int serie) {
        super(id, nome, email);
        this.serie = serie;
    }

    @Override
    public String toString(){
        return "Id: " + getId() + "; Nome: " + getNome() + "; Email: " + getEmail() + "; Serie: " + serie;
    }

    @Override
    public TipoPessoa pegarTipo() {
        return TipoPessoa.ALUNO;
    }

}
