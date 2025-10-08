package estudando.colecaoComArrayList.ex8;

import java.util.List;

public class Time {
    private List<Jogador> jogadores;

    public Time(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void mostrarJogadores () {
        System.out.println("Jogadores:");
        for (Jogador jogador : jogadores) {
            System.out.printf("Nome: %s", jogador.getNome());
            System.out.printf("Idade: %d", jogador.getIdade());
            System.out.println("--------------");
        }
    }
}
