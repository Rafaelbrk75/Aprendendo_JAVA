package estudando.colecaoComArrayList.revisao3;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String endereco;
    private List<Jogador> jogadores;

    public Time(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.jogadores = new ArrayList<>();
    }

    public void contratarJogador(Jogador jogador){
        System.out.printf("Jogador %s contratado!\n", jogador.getNome());
        this.jogadores.add(jogador);
    }

    public void exibirEscalacao(){
        System.out.println("Escalação do time:");
        for (Jogador jogador : this.jogadores) {
            System.out.printf("Jogador: %s Posição: %d\n", jogador.getNome(), jogador.getPosicao());
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
