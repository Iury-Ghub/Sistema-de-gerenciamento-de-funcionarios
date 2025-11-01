package model.pessoas;

import model.empresa.Departamento;
import model.interfaces.Bonificavel;

import java.time.LocalDate;

public class Vendedor extends Funcionario implements Bonificavel {
    private double totalVendas;
    private double comissao;

    protected Vendedor(String nome, String cpf, double salarioBase, LocalDate dataContratacao, Departamento departamento) {
        super(nome, cpf, salarioBase, dataContratacao, departamento);
    }

    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public double calcularPagamento() {
        return 0;
    }

    public void registrarVenda(double valor){
    }
}
