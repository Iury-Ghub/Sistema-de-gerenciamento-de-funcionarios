package model.pessoas;

import model.empresa.Departamento;
import model.interfaces.Bonificavel;

import java.time.LocalDate;

public class Vendedor extends Funcionario implements Bonificavel {
    private double totalVendas;
    private final double comissao;

    public Vendedor(String nome, String cpf, double salarioBase, LocalDate dataContratacao, Departamento departamento, double comissao) {
        super(nome, cpf, salarioBase, dataContratacao, departamento);
        this.totalVendas = 0;
        this.comissao = comissao;
    }

    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public double calcularPagamento() {
        return this.salarioBase + (totalVendas*comissao);
    }

    public void registrarVenda(double valor){
        this.totalVendas += valor;
        System.out.println("Venda de R$ "+ valor);
    }
}
