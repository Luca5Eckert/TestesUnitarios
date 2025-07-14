package com.estudo.testes.view;

import com.estudo.testes.service.ListaPessoa;
import com.estudo.testes.service.PessoaResponse;
import com.estudo.testes.service.PessoaService;

import java.util.List;
import java.util.UUID;

public class MenuListarPessoas implements Menu {

    private PessoaService pessoaService;

    public MenuListarPessoas(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @Override
    public Menu executarMenu() {
        try {
            ListaPessoa listaPessoa = pessoaService.listarPessoas();
            mostrarMenuListagem(listaPessoa.emTexto());
            return definirProximoMenu(pegarAlternativa(), listaPessoa.emLista());
        } catch (RuntimeException re){
            System.err.println(re.getMessage());
        }

       return this;
    }

    private Menu definirProximoMenu(String s, List<PessoaResponse> pessoaResponses) {
        if(!s.trim().equals("S")){
            int index = Integer.parseInt(s);
            var pessoaResponse = pessoaResponses.get(index);

            new MenuVisualizarPessoa(pessoaService,pessoaResponse);
        }

        return TipoMenu.MENU_GERAL.getMenu();

    }


    public void mostrarMenuListagem(String lista){
        System.out.println("---------------------------------------------------");
        System.out.println("                LISTAS PESSOAS                     ");
        System.out.println("---------------------------------------------------");
        System.out.println(" S - Sair");
        System.out.println("---------------------------------------------------");
        System.out.println(lista);
        System.out.println("---------------------------------------------------");
    }
}
