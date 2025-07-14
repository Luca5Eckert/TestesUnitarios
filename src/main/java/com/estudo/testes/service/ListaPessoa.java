package com.estudo.testes.service;

import com.estudo.testes.view.PessoaDto;

import java.lang.reflect.Array;
import java.util.List;

public record ListaPessoa(String emTexto, List<PessoaResponse> emLista) {
}
