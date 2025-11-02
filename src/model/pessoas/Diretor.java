package model.pessoas;

import model.empresa.Departamento;
import model.interfaces.Bonificavel;
import model.interfaces.Relatorio;

import java.time.LocalDate;

public class Diretor extends Funcionario implements Bonificavel, Relatorio {

    public Diretor(String nome, String cpf, double salarioBase, LocalDate dataContratacao, Departamento departamento) {
        super(nome, cpf, salarioBase, dataContratacao, departamento);
    }

    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public void gerarRelatorio() {

    }

    @Override
    public double calcularPagamento() {
        return 0;
    }
}
