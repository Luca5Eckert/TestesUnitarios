package com.estudo.testes.view;


public class MenuProvider {

    private Menu menu;

    public MenuProvider(Menu menu) {
        this.menu = menu;
    }

    public void iniciarFluxo(){
        while(verificarContinuidade()){
            executarMenu();
        }
    }


    private void executarMenu(){
       menu = menu.executarMenu();
    }

    private boolean verificarContinuidade(){
        return menu != null;
    }

}
