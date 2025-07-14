package com.estudo.testes.view;

import com.estudo.testes.service.PessoaResponse;
import com.estudo.testes.service.PessoaService;

import java.util.Scanner;

public class MenuVisualizarPessoa implements Menu {

    private PessoaResponse pessoaResponse;
    private final PessoaService pessoaService;

    public MenuVisualizarPessoa(PessoaService pessoaService, PessoaResponse pessoaResponse) {
        this.pessoaService = pessoaService;
        this.pessoaResponse = pessoaResponse;
    }

    @Override
    public Menu executarMenu() {
        mostrarInformacoes();
        String opcao = pegarAlternativa();

        return devolverResposta(opcao);
    }

    private Menu devolverResposta(String opcao) {
        return switch (opcao){
            case "1" -> removerItem();
            case "2" -> new MenuGeral();
            default -> this;
        };
    }

    private Menu removerItem() {
        pessoaService.removerPessoa(pessoaResponse.id());
        return new MenuGeral();
    }

    private void mostrarInformacoes(){
        System.out.println("==============================");
        System.out.println("          + " + pessoaResponse.tipoPessoa() + "           ");
        System.out.println("-----------------------------");
        System.out.println(" NOME: " + pessoaResponse.nome());
        System.out.println(" EMAIL: " + pessoaResponse.email());
        System.out.println("------------------------------");
        System.out.println(" 1- remover");
        System.out.println(" 2- voltar");
        System.out.println("------------------------------");

    }


}
