import model.empresa.Departamento;
import model.empresa.Projeto;
import model.pessoas.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Departamento ti = new Departamento("TI");
        Departamento vendas = new Departamento("Vendas");

        LocalDate agora = LocalDate.now();
        Diretor diretor1 = new Diretor("João",
                "111.333.333-22",
                10000,
                agora,
                ti);
        Gerente gerente1 = new Gerente("pedro",
                "222.333.333-22",
                5000,
                agora,
                ti,
                0.5);
        Estagiario estagiario1 = new Estagiario("mário",
                "333.333.333-22",
                120,
                6.5,
                agora,
                ti,
                true);


        Diretor diretor2 = new Diretor("ana",
                "111.333.333-22",10000,
                agora,
                vendas);
        Gerente gerente2 = new Gerente("bruna",
                "222.333.333-22",
                5000,
                agora,
                vendas,
                0.5);
        Estagiario estagiario2 = new Estagiario("maria",
                "333.333.333-22",
                120,
                6.5,
                agora,
                vendas,
                true);
        Vendedor vendedor1 = new Vendedor(
                "Pedro Gomes",
                "333.444.555-66",
                4000,
                LocalDate.of(2020, 1, 15),
                vendas,
                0.05
        );

        Vendedor vendedor2 = new Vendedor(
                "Luciana Costa",
                "444.555.666-77",
                3800,
                LocalDate.of(2021, 5, 10),
                vendas,
                0.05
        );

        ti.adicionarFuncionario(diretor1);
        ti.adicionarFuncionario(gerente1);
        ti.adicionarFuncionario(estagiario1);

        vendas.adicionarFuncionario(diretor2);
        vendas.adicionarFuncionario(gerente2);
        vendas.adicionarFuncionario(estagiario2);

        Projeto site = new Projeto("Site da Empresa",
                LocalDate.of(2025, 1, 1),
                LocalDate.of(2025, 12, 31),
                500000);

        site.adicionarMembro(diretor1);
        site.adicionarMembro(gerente2);
        site.adicionarMembro(estagiario2);

        vendedor1.registrarVenda(5000);
        vendedor1.registrarVenda(2000);
        vendedor2.registrarVenda(5000);
        vendedor2.registrarVenda(2000);

        System.out.println("Pagamento = "+ vendedor1.calcularPagamento());

        System.out.println("===== FOLHA DE PAGAMENTO =====");
        System.out.println("Departamento TI: R$ " + ti.calcularFolhaMensal());
        System.out.println("Departamento Vendas: R$ " + vendas.calcularFolhaMensal());

        double totalEmpresa = ti.calcularFolhaMensal() + vendas.calcularFolhaMensal();
        System.out.println("\nTotal da Empresa: R$ " + totalEmpresa);
    }
    }