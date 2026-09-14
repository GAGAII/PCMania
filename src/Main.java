import java.util.Scanner;

import model.Cliente;
import model.Computador;
import model.HardwareBasico;
import model.MemoriaUSB;
import model.SistemaOperacional;
import service.ProcessarPedido;

public class Main {
    private static final int MATRICULA = 480;

    private Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente("Gabriel Brandão", "000.000.000-00");

        Computador promocao1 = criarPromocao1();
        Computador promocao2 = criarPromocao2();
        Computador promocao3 = criarPromocao3();

        int opcao;

        do {
            mostrarMenu();

            while (!scanner.hasNextInt()) {
                System.out.println("Opcao invalida. Digite 0, 1, 2 ou 3.");
                scanner.next();
                mostrarMenu();
            }

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cliente.adicionarComputador(promocao1);
                    System.out.println("Promocao 1 adicionada ao pedido.");
                    break;
                case 2:
                    cliente.adicionarComputador(promocao2);
                    System.out.println("Promocao 2 adicionada ao pedido.");
                    break;
                case 3:
                    cliente.adicionarComputador(promocao3);
                    System.out.println("Promocao 3 adicionada ao pedido.");
                    break;
                case 0:
                    System.out.println("Finalizando compra...");
                    break;
                default:
                    System.out.println("Opcao invalida. Digite 0, 1, 2 ou 3.");
            }
        } while (opcao != 0);

        cliente.mostrarResumoCompra();
        ProcessarPedido.processar(cliente.getComputadores());

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n===== PC MANIA =====");
        System.out.println("1 - Promocao Apple - R$ " + MATRICULA);
        System.out.println("2 - Promocao Samsung - R$ " + (MATRICULA + 1));
        System.out.println("3 - Promocao Dell - R$ " + (MATRICULA + 2));
        System.out.println("0 - Finalizar compra");
        System.out.print("Escolha uma opcao: ");
    }

    private static Computador criarPromocao1() {
        HardwareBasico[] hardwares = {
                new HardwareBasico("Processador Core i5", 2200),
                new HardwareBasico("Memoria RAM", 8),
                new HardwareBasico("HD", 500)
        };

        SistemaOperacional so = new SistemaOperacional("macOS Sequoia", 64);
        Computador computador = new Computador("Apple", MATRICULA, hardwares, so);
        computador.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        return computador;
    }

    private static Computador criarPromocao2() {
        HardwareBasico[] hardwares = {
                new HardwareBasico("Processador Core i7", 3370),
                new HardwareBasico("Memoria RAM", 16),
                new HardwareBasico("HD", 1000)
        };

        SistemaOperacional so = new SistemaOperacional("Windows 8", 64);
        Computador computador = new Computador("Samsung", MATRICULA + 1, hardwares, so);
        computador.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        return computador;
    }

    private static Computador criarPromocao3() {
        HardwareBasico[] hardwares = {
                new HardwareBasico("Processador Core i7", 4500),
                new HardwareBasico("Memoria RAM", 32),
                new HardwareBasico("HD", 2000)
        };

        SistemaOperacional so = new SistemaOperacional("Windows 10", 64);
        Computador computador = new Computador("Dell", MATRICULA + 2, hardwares, so);
        computador.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        return computador;
    }
}
