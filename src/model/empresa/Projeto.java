package model.empresa;

import model.pessoas.Funcionario;
import java.time.LocalDate;
import java.util.ArrayList;

public class Projeto {
    private String nome;
    private LocalDate datainicio;
    private LocalDate datafim;
    private double orcamento;
    private ArrayList<Funcionario> equipe = new ArrayList<>();

    public Projeto(String nome, LocalDate datainicio, LocalDate datafim, double orcamento) {
        this.nome = nome;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.orcamento = orcamento;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public void adicionarMembro(Funcionario f){
        equipe.add(f);
        System.out.println("Funcionario add");
    }

    public  void removerMembro(Funcionario f){
        equipe.remove(f);
        System.out.println("Funcionario tirado");
    }

    public  void gerarResumoProjeto(){
        for(Funcionario funcionario:equipe){
            System.out.println("Nome: "+ funcionario.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(LocalDate datainicio) {
        this.datainicio = datainicio;
    }

    public LocalDate getDatafim() {
        return datafim;
    }

    public void setDatafim(LocalDate datafim) {
        this.datafim = datafim;
    }

    public ArrayList<Funcionario> getEquipe() {
        return equipe;
    }

    public void setEquipe(ArrayList<Funcionario> equipe) {
        this.equipe = equipe;
    }
}
