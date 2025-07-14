package com.estudo.testes.view;

import java.util.Scanner;

public enum Leitor {
    SCANNER(new Scanner(System.in));

    Scanner input;

    Leitor(Scanner input){
        this.input = input;
    }

    public Scanner getInput(){
        return input;
    }

}
