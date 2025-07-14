package com.estudo.testes.view;

import com.estudo.testes.model.TipoPessoa;
import com.estudo.testes.service.PessoaService;

import java.util.Scanner;

public class MenuGeral implements Menu {

    public static final String ADICIONAR_PESSOA = "1";
    public static final String PESQUISAR_PESSOA = "2";

    @Override
    public Menu executarMenu() {
        try {
            mostrarOpcoesCRUD();
            String opcao = pegarAlternativa();

            return irProximoMenu(opcao);
        } catch (RuntimeException re){
            System.err.println(re.getMessage());
        }
        return TipoMenu.MENU_GERAL.getMenu();

    }


    public void mostrarOpcoesCRUD(){
        System.out.println("==============================");
        System.out.println("           ESCOLHA           ");
        System.out.println("-----------------------------");
        System.out.println(" 1- Adicionar Pessoa ");
        System.out.println(" 2- Pesquisar Pessoa ");
        System.out.println("==============================");

    }

    public Menu irProximoMenu(String opcao){
        return switch(opcao){
            case ADICIONAR_PESSOA -> TipoMenu.ADICIONAR_PESSOA.getMenu();
            case PESQUISAR_PESSOA -> TipoMenu.MENU_LISTAR.getMenu();
            default -> throw new IllegalStateException("Erro na entrada");
        };
    }


}
