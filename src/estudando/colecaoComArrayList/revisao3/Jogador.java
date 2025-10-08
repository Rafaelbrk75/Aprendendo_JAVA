package estudando.colecaoComArrayList.revisao3;

public class Jogador {
    private String nome;
    private int posicao;

    public Jogador(String nome, int posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
}
