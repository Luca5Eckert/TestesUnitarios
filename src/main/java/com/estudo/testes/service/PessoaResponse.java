package com.estudo.testes.service;

import com.estudo.testes.model.TipoPessoa;

import java.util.UUID;

public record PessoaResponse(UUID id, String nome, String email, TipoPessoa tipoPessoa) {
}
