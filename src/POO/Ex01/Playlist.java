package POO.Ex01;

public class Playlist {
    private Musica[] musicas;
    private int proximaPosicaoLivre;

    public Playlist() {
        this.musicas = new Musica[20]; // capacidade fixa
        this.proximaPosicaoLivre = 0;
    }

    public boolean adicionarMusica(Musica musica) {
        if (this.proximaPosicaoLivre >= this.musicas.length) {
            System.out.println("Playlist cheia! Não dá pra adicionar mais músicas.");
            return false;
        }
        this.musicas[this.proximaPosicaoLivre] = musica;
        this.proximaPosicaoLivre++;
        return true;
    }

    public void listarMusicas() {
        for (int i = 0; i < this.proximaPosicaoLivre; i++) {
            System.out.println(this.musicas[i]);
        }
    }

    public int tamanho() {
        return this.proximaPosicaoLivre;
    }
}

