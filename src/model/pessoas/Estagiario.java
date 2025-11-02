package model.pessoas;

import model.empresa.Departamento;

import java.time.LocalDate;

public class Estagiario extends Funcionario{
    private final int horasTrabalhadas;
    private final double valorHora;
    private boolean contratoAtivo;

    public Estagiario(String nome, String cpf, int horasTrabalhadas, double valorHora, LocalDate dataContratacao, Departamento departamento, boolean contratoAtivo) {
        super(nome, cpf, 0, dataContratacao, departamento);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.contratoAtivo = contratoAtivo;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }

    public void renovarContrato(){
        this.contratoAtivo = true;
    }

    public String getCargo(){
        return "Estagiário";
    }

    public boolean isContratoAtivo() {
        return contratoAtivo;
    }

    public void setContratoAtivo(boolean contratoAtivo) {
        this.contratoAtivo = contratoAtivo;
    }
}
