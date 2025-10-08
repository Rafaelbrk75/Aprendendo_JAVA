package ex09;

public class Periferico {
    private String tipo;   // "Mouse", "Teclado", "Monitor"
    private String marca;  // "Logitech", "Dell", etc.

    public Periferico(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public String getTipo() { return tipo; }
    public String getMarca() { return marca; }

    @Override
    public String toString() {
        return tipo + " - " + marca;
    }
}
