package ex05;

public class Main {
    public static void main(String[] args) {
        Time corintias = new Time("Corintias", "São Paulo");
        Jogador pele = new Jogador("Pele", "7");

        corintias.addJogador(pele);
        corintias.listarJogadores();
    }
}
