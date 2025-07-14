package com.estudo.testes.view;

import com.estudo.testes.service.PessoaService;

public enum TipoMenu {
    ADICIONAR_PESSOA(new MenuAdicionarPessoa(new PessoaService())),
    MENU_GERAL(new MenuGeral()),
    MENU_LISTAR(new MenuListarPessoas(new PessoaService()));

    Menu menu;

    TipoMenu(Menu menu){
        this.menu = menu;
    }

    public Menu getMenu(){
        return menu;
    }
}
