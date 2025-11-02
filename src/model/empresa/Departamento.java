package model.empresa;

import model.pessoas.Funcionario;

import java.util.ArrayList;
import java.util.Objects;

public class Departamento {
    private String nome;
    private final ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private Projeto projetoAtivo;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);

    }

    public double calcularFolhaMensal() {
        double tot = 0;
        for (Funcionario funcionario:funcionarios){
            tot += funcionario.calcularPagamento();
        }
        return tot;
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

