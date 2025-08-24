package academy.devdojo.maratona.introducao.Csobrecargametodos.test;

import academy.devdojo.maratona.introducao.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akuma Drive", "TV", 12, "Ação");
        anime.imprime();
    }
}
