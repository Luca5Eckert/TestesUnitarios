package com.estudo.testes.service;

import com.estudo.testes.model.*;
import com.estudo.testes.view.PessoaDto;

import java.util.UUID;

public class PessoaFactory {

    public static Pessoa instanceTo(PessoaDto pessoaDto){
        Nome nome = new Nome(pessoaDto.nome());
        Email email = new Email(pessoaDto.email());
        UUID id = UUID.randomUUID();

        return switch(pessoaDto.tipoPessoa()){
            case TipoPessoa.ALUNO -> new Aluno(id, nome, email, pessoaDto.serie());
            case PROFESSOR -> new Professor(id, nome, email, pessoaDto.disciplina());
        };
    }
}
