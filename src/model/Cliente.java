package model;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;
    private int quantidadeComputadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[100];
        this.quantidadeComputadores = 0;
    }

    public void adicionarComputador(Computador computador) {
        if (quantidadeComputadores < computadores.length) {
            computadores[quantidadeComputadores] = computador;
            quantidadeComputadores++;
        } else {
            System.out.println("Limite de computadores do pedido atingido.");
        }
    }

    public float calculaTotalCompra() {
        float total = 0;

        for (int i = 0; i < quantidadeComputadores; i++) {
            total += computadores[i].getPreco();
        }

        return total;
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public void mostrarResumoCompra() {
        System.out.println("\n===== RESUMO DA COMPRA =====");
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);

        if (quantidadeComputadores == 0) {
            System.out.println("Nenhum computador foi adquirido.");
        } else {
            for (int i = 0; i < quantidadeComputadores; i++) {
                System.out.println("\nComputador " + (i + 1));
                computadores[i].mostraPCConfigs();
            }
        }

        System.out.printf("%nTotal da compra: R$ %.2f%n", calculaTotalCompra());
    }
}
