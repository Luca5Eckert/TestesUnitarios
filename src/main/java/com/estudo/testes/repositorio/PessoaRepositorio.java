package com.estudo.testes.repositorio;

import com.estudo.testes.model.Pessoa;
import com.estudo.testes.view.PessoaDto;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PessoaRepositorio {

    private static Map<UUID, Pessoa> listaPessoas = new HashMap<>();

    public PessoaRepositorio(){
    }

    public void adicionarPessoa(Pessoa pessoa){
        listaPessoas.put(pessoa.getId(),pessoa);
    }

    public void removerPessoa(UUID idPessoa){
        listaPessoas.remove(idPessoa);
    }

    public void pegarPessoa(UUID idPessoa){
        listaPessoas.get(idPessoa);
    }

    public void alterarPessoa(UUID idPessoa, Pessoa pessoa){
        listaPessoas.replace(idPessoa, pessoa);
    }


    public String exibirLista(){
        StringBuilder stringBuilder = new StringBuilder();
        int contador = 0;

        for(Pessoa pessoa : listaPessoas.values()){
            stringBuilder.append(contador).append(" - ").append(pessoa).append("\n");
            contador++;
        }
        return stringBuilder.toString();
    }


    public Map<UUID, Pessoa> getLista() {
        return listaPessoas;
    }
}
