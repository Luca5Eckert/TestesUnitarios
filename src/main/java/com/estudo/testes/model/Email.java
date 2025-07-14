package com.estudo.testes.model;

import com.estudo.testes.exceptions.EmailEmBrancoException;
import com.estudo.testes.exceptions.EmailSintaxeException;

import java.util.regex.Pattern;

public record Email(String valor) {
    public static final Pattern EMAIL_VALIDO = Pattern.compile("^(.+)@(.+)$");

    public Email(String valor) {
        if (!valor.isBlank()) {
            if (!EMAIL_VALIDO.matcher(valor).matches()) {
                throw new EmailSintaxeException("Sintaxe do email incorreta");
            }

            this.valor = valor.toLowerCase();
        } else {
            throw new EmailEmBrancoException("Email não pode ficar em branco");
        }

    }

    @Override
    public String toString() {
        return valor;
    }

    public String getValor(){
        return valor;
    }

}
