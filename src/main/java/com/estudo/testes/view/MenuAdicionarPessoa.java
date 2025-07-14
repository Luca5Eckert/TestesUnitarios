package com.estudo.testes.view;

import com.estudo.testes.model.Disciplina;
import com.estudo.testes.model.TipoPessoa;
import com.estudo.testes.service.PessoaService;

public class MenuAdicionarPessoa implements Menu {

    private final PessoaService pessoaService;

    public MenuAdicionarPessoa(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @Override
    public Menu executarMenu() {
        try {
            PessoaDto pessoaDto = mostrarMenu();

            var pessoa = pessoaService.adicionarPessoa(pessoaDto);
            return new MenuVisualizarPessoa(this.pessoaService, pessoa);

        } catch (IndexOutOfBoundsException ioobe){
            System.err.println("Entrada invalida");
        } catch ( RuntimeException re){
            System.err.println(re.getMessage());
        }

        return TipoMenu.MENU_GERAL.getMenu();
    }

    public PessoaDto mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("                ADICIONAR ITEM                     ");
        System.out.println("---------------------------------------------------");
        System.out.println(" Tipo da pessoa: ");
        TipoPessoa.pegarValoresTipos();
        String opcao = pegarAlternativa();
        TipoPessoa tipoPessoa = TipoPessoa.values()[Integer.parseInt(opcao)];

        System.out.println(" Nome: ");
        String nome = pegarAlternativa();

        System.out.println(" Email: ");
        String email = pegarAlternativa();

        return switch(tipoPessoa){
            case PROFESSOR -> mostrarMenuProfessor(nome, email);
            case ALUNO -> mostrarMenuAluno(nome, email);
        };

    }

    private PessoaDto mostrarMenuAluno(String nome, String email){
        System.out.println(" Serie: ");
        String serie = pegarAlternativa();

        return new PessoaDto(nome, email, null, Integer.parseInt(serie), TipoPessoa.ALUNO);

    }

    private PessoaDto mostrarMenuProfessor(String nome, String email){
        System.out.println(" Disciplina: ");
        Disciplina.pegarValoresTipos();

        String numeroDisciplina = pegarAlternativa();
        Disciplina disciplina = Disciplina.values()[Integer.parseInt(numeroDisciplina)];

        return new PessoaDto(nome, email, disciplina, 0, TipoPessoa.PROFESSOR);

    }


}
