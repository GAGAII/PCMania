package model;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardwaresBasicos;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, HardwareBasico[] hardwaresBasicos,
                      SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.hardwaresBasicos = hardwaresBasicos;
        this.sistemaOperacional = sistemaOperacional;
    }

    public float getPreco() {
        return preco;
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.printf("Preco: R$ %.2f%n", preco);

        for (HardwareBasico hardware : hardwaresBasicos) {
            if (hardware != null) {
                System.out.println(hardware.getNome() + ": " + formatarCapacidade(hardware));
            }
        }

        System.out.println("Sistema Operacional: " + sistemaOperacional.getNome()
                + " (" + sistemaOperacional.getTipo() + " bits)");

        if (memoriaUSB != null) {
            System.out.println("Memoria USB: " + memoriaUSB.getNome()
                    + " - " + memoriaUSB.getCapacidade() + " GB");
        }
    }

    private String formatarCapacidade(HardwareBasico hardware) {
        if (hardware.getNome().toLowerCase().contains("processador")) {
            return String.format("%.0f MHz", hardware.getCapacidade());
        }

        return String.format("%.0f GB", hardware.getCapacidade());
    }
}
