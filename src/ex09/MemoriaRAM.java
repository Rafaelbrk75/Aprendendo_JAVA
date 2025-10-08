package ex09;

public class MemoriaRAM {
    private int capacidadeGB;  // ex: 16
    private String tipo;       // ex: "DDR4"

    public MemoriaRAM(int capacidadeGB, String tipo) {
        this.capacidadeGB = capacidadeGB;
        this.tipo = tipo;
    }

    public int getCapacidadeGB() { return capacidadeGB; }
    public String getTipo() { return tipo; }

    @Override
    public String toString() {
        return capacidadeGB + "GB " + tipo;
    }
}

