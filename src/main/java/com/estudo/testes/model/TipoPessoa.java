package com.estudo.testes.model;

public enum TipoPessoa {
    ALUNO,
    PROFESSOR;


    public static void pegarValoresTipos() {
        for (int tipo = 0; values().length > tipo; tipo++) {
            System.out.println(" " + tipo + " - " + values()[tipo]);
        }
    }
}
