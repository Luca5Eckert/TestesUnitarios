package com.estudo.testes.model;

public enum Disciplina {
    MATEMATICA, HISTORIA, PORTUGUES, INGLES;

    public static void pegarValoresTipos() {
        for (int tipo = 0; values().length > tipo; tipo++) {
            System.out.println(" " + tipo + " - " + values()[tipo]);
        }
    }
}
