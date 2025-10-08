package ex09;

public class Main {
    public static void main(String[] args) {
        Processador cpu = new Processador("Ryzen 5 5600", 3.5);
        MemoriaRAM ram = new MemoriaRAM(16, "DDR4");
        Computador pc = new Computador(cpu, ram);

        pc.specs();

        Periferico mouse = new Periferico("Mouse", "Logitech");
        Periferico teclado = new Periferico("Teclado", "Redragon");

        pc.conectarPeriferico(mouse);
        pc.conectarPeriferico(teclado);
        pc.listarPerifericos();

        pc.desconectarPeriferico(mouse);
        pc.listarPerifericos();
    }
}

