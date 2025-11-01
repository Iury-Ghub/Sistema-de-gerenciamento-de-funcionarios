package model.pessoas;

import model.empresa.Departamento;

import java.time.LocalDate;

public class Estagiario extends Funcionario{
    private int horasTrabalhadas;
    private double valorHora;
    private boolean contrstoAtivo;

    protected Estagiario(String nome, String cpf, double salarioBase, LocalDate dataContratacao, Departamento departamento) {
        super(nome, cpf, salarioBase, dataContratacao, departamento);
    }

    @Override
    public double calcularPagamento() {
        return 0;
    }

    public void renovarContrato(){

    }

    public String getCargo(){
        return "Estagiário";
    }

}
