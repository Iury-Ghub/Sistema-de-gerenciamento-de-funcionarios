package model.pessoas;

import model.empresa.Departamento;
import model.interfaces.Bonificavel;
import model.interfaces.Relatorio;

import java.time.LocalDate;

public class Gerente extends Funcionario implements Bonificavel, Relatorio {

    private final double bonusAnual;
    private final int equipeGerenciada;

    public Gerente(String nome, String cpf, double salarioBase, LocalDate dataContratacao, Departamento departamento, double bonusAnual) {
        super(nome, cpf, salarioBase, dataContratacao, departamento);
        this.bonusAnual = bonusAnual;
        this.equipeGerenciada = 0;
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
