package com.estudo.testes.view;

import com.estudo.testes.model.Disciplina;
import com.estudo.testes.model.TipoPessoa;

public record PessoaDto(String nome, String email, Disciplina disciplina, int serie, TipoPessoa tipoPessoa) {

    public PessoaDto(String nome, String email, TipoPessoa tipoPessoa){
        this(nome, email, null, -1, tipoPessoa);
    }
}
