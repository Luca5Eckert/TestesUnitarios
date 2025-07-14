package com.estudo.testes.service;

import com.estudo.testes.model.Pessoa;
import com.estudo.testes.repositorio.PessoaRepositorio;

import java.util.UUID;

public class PessoaService {

    private PessoaRepositorio pessoaRepositorio;

    private void adicionarPessoa(Pessoa pessoa){
        pessoaRepositorio.adicionarPessoa(pessoa);
    }

    public void removerPessoa(UUID idPessoa){
        pessoaRepositorio.removerPessoa(idPessoa);
    }

    public void pegarPessoa(UUID idPessoa){
        pessoaRepositorio.pegarPessoa(idPessoa);
    }

    public void alterarPessoa(UUID idPessoa, Pessoa pessoa){
        pessoaRepositorio.alterarPessoa(idPessoa, pessoa);
    }

}
