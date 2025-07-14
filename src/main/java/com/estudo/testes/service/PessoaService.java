package com.estudo.testes.service;

import com.estudo.testes.model.Pessoa;
import com.estudo.testes.repositorio.PessoaRepositorio;
import com.estudo.testes.view.PessoaDto;

import java.util.*;
import java.util.stream.Collectors;

public class PessoaService {

    private PessoaRepositorio pessoaRepositorio;

    public PessoaService() {
        this.pessoaRepositorio = new PessoaRepositorio();
    }

    public PessoaResponse adicionarPessoa(PessoaDto pessoaDto){
        Pessoa pessoa = PessoaFactory.instanceTo(pessoaDto);
        pessoaRepositorio.adicionarPessoa(pessoa);
        return modelToDto(pessoa);
    }

    public void removerPessoa(UUID idPessoa){
        pessoaRepositorio.removerPessoa(idPessoa);
    }

    public void pegarPessoa(UUID idPessoa){
        pessoaRepositorio.pegarPessoa(idPessoa);
    }

    public void alterarPessoa(UUID idPessoa, PessoaDto pessoaDto){
        Pessoa pessoa = PessoaFactory.instanceTo(pessoaDto);
        pessoaRepositorio.alterarPessoa(idPessoa, pessoa);
    }

    public ListaPessoa listarPessoas(){
        String exibicaoLista = pessoaRepositorio.exibirLista();
        List<PessoaResponse> listaDto = transformarListaDto();


        return new ListaPessoa(exibicaoLista, listaDto);
    }

    private List<PessoaResponse> transformarListaDto() {
        var listaPessoas = pessoaRepositorio.getLista();

        return listaPessoas.values().stream()
                .map(this::modelToDto)
                .collect(Collectors.toList());
    }

    private PessoaResponse modelToDto(Pessoa pessoa){
        return new PessoaResponse(pessoa.getId(), pessoa.getNome().getValor(), pessoa.getEmail().getValor(), pessoa.pegarTipo());
    }


}
