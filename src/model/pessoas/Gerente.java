package model.pessoas;

import model.empresa.Departamento;
import model.interfaces.Bonificavel;
import model.interfaces.Relatorio;

import java.time.LocalDate;

public class Gerente extends Funcionario implements Bonificavel, Relatorio {

    private double bonusAnual;
    private int equipeGeenciada;

    public Gerente(String nome, String cpf, double salarioBase, LocalDate dataContratacao, Departamento departamento) {
        super(nome, cpf, salarioBase, dataContratacao, departamento);
    }

    @Override
    public double calcularPagamento() {
        return 0;
    }

    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public void gerarRelatorio() {

    }
}
