package ex05;

public class Time {
    private String nome;
    private String cidade;
    private Jogador[]  jogadores;
    private int quantidadeJ;

    public Time (String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        jogadores = new Jogador[23];
        this.quantidadeJ = 0;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public void addJogador(Jogador jogador) {
        if (quantidadeJ < jogadores.length) {
            jogadores[quantidadeJ] = jogador;
            quantidadeJ++;
        } else {
            System.out.println("O time atingiu o limite de jogadores!");
        }
    }

    public void listarJogadores() {
        if (quantidadeJ == 0) {
            System.out.println("Nenhum jogador foi cadastrado ainda.");
        } else {
            for (int i = 0; i < quantidadeJ; i++) {
                System.out.println(jogadores[i]);
            }
        }
    }
}
