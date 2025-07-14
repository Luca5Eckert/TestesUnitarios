package com.estudo.testes.model;

import java.util.UUID;

public class Pessoa {

    private UUID id;
    private Nome nome;
    private Email email;

    public Pessoa(UUID id, Nome nome, Email email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Nome getNome() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
