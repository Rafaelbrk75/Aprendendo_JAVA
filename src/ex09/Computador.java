package ex09;

import java.util.ArrayList;
import java.util.List;

public class Computador {
    private final Processador processador;
    private final MemoriaRAM memoria;

    private final List<Periferico> perifericos = new ArrayList<>();

    public Computador(Processador processador, MemoriaRAM memoria) {
        if (processador == null || memoria == null) {
            throw new IllegalArgumentException("Computador precisa de processador e memória.");
        }
        this.processador = processador;
        this.memoria = memoria;
    }

    public void conectarPeriferico(Periferico p) {
        if (p != null && !perifericos.contains(p)) {
            perifericos.add(p);
        }
    }

    public void desconectarPeriferico(Periferico p) {
        perifericos.remove(p);
    }

    public void listarPerifericos() {
        if (perifericos.isEmpty()) {
            System.out.println("Sem periféricos conectados.");
            return;
        }
        System.out.println("Periféricos conectados:");
        for (Periferico p : perifericos) {
            System.out.println("- " + p);
        }
    }

    public void specs() {
        System.out.println("Processador: " + processador);
        System.out.println("Memória: " + memoria);
    }
}
