package model.pessoas;

import model.empresa.Departamento;

import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salarioBase;
    protected LocalDate dataContratacao;
    protected Departamento departamento;

    protected Funcionario(String nome, String cpf, double salarioBase, LocalDate dataContratacao, Departamento departamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.dataContratacao = dataContratacao;
        this.departamento = departamento;
    }

    public abstract double calcularPagamento();

    public int getTempoDeCasa(Funcionario funcionario){
        LocalDate hoje = LocalDate.now();
        
        Period duracao = Period.between(hoje,funcionario.dataContratacao);
        return duracao.getYears();
    }

    public String getCargo(Funcionario funcionario){
        return "Funcionário";
    }

    public String toString(){
        return "Nome: "+ nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }
}
