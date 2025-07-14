package com.estudo.testes.model;

import java.util.UUID;

public class Professor extends Pessoa{

    private Disciplina disciplina;

    public Professor(UUID id, Nome nome, Email email, Disciplina disciplina) {
        super(id, nome, email);
        this.disciplina = disciplina;
    }

    @Override
    public String toString(){
        return "Id: " + getId() + "; Nome: " + getNome() + "; Email: " + getEmail() + "; Disciplina: " + getDisciplina();
    }

    @Override
    public TipoPessoa pegarTipo() {
        return TipoPessoa.PROFESSOR;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
