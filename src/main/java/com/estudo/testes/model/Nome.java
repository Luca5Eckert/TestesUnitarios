package com.estudo.testes.model;

import com.estudo.testes.exceptions.NomeEmBrancoException;

public record Nome(String valor) {

    public Nome(String valor) {
        if(valor.isBlank()){
            throw new NomeEmBrancoException("Nome não pode ficar em branco");
        }
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }

}
