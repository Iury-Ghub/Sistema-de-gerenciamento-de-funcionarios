package model.empresa;

import model.pessoas.Funcionario;

import java.util.ArrayList;
import java.util.Objects;

public class Departamento {
    private String nome;
    private ArrayList<Funcionario> funcionarios;
    private Projeto projetoAtivo;

    public Departamento(String nome, ArrayList<Funcionario> funcionarios, Projeto projetoAtivo) {
        this.nome = nome;
        this.funcionarios = funcionarios;
        this.projetoAtivo = projetoAtivo;
    }

    public void adicionarFuncionario(Funcionario f) {

    }

    public double caucularFolhaMensal() {
        return 0;
    }

    public void listarFuncionario() {

    }

    public Funcionario buscarPorCpf(String cpf) {
        for (Funcionario funcionario : this.funcionarios) {
            if (Objects.equals(funcionario.getCpf(), cpf)) {
                return funcionario;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Projeto getProjetoAtivo() {
        return projetoAtivo;
    }

    public void setProjetoAtivo(Projeto projetoAtivo) {
        this.projetoAtivo = projetoAtivo;
    }
}

