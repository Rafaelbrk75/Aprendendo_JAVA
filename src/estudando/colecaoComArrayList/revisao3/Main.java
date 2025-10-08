package estudando.colecaoComArrayList.revisao3;

public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Jao", 11);
        Jogador j2 = new Jogador("Pele", 10);
        Jogador j3 = new Jogador("Rafael", 1);
        Jogador j4 = new Jogador("Murilo", 5);
        Jogador j5 = new Jogador("Bruno", 6);
        Jogador j6 = new Jogador("Dunha", 7);

        Time t1 = new Time("Corintias", "Rua gilbert, 834");

        t1.contratarJogador(j1);
        t1.contratarJogador(j2);
        t1.contratarJogador(j3);
        t1.contratarJogador(j4);
        t1.contratarJogador(j5);
        t1.contratarJogador(j6);

        t1.exibirEscalacao();



    }
}
