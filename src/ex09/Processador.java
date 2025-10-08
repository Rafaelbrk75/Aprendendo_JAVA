package ex09;

public class Processador {
    private String modelo;     // ex: "Ryzen 5 5600"
    private double clockGhz;   // ex: 3.5

    public Processador(String modelo, double clockGhz) {
        this.modelo = modelo;
        this.clockGhz = clockGhz;
    }

    public String getModelo() { return modelo; }
    public double getClockGhz() { return clockGhz; }

    @Override
    public String toString() {
        return modelo + " (" + clockGhz + " GHz)";
    }
}
