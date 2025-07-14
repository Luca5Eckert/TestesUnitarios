package com.estudo.testes.view;

import java.util.Scanner;

public interface Menu {

    public Menu executarMenu();

    default String pegarAlternativa() {
        return Leitor.SCANNER.getInput().nextLine();
    }
}
