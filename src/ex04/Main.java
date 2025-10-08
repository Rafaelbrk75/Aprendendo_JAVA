package ex04;

public class Main {
    public static void main(String[] args) {
        Autor jose = new Autor("Brasileiro", "Jose");

        Livro livro1 = new Livro("João e o pé de feijão", jose);
        Livro livro2 = new Livro("História do Brasil", jose);

        jose.adicionarLivro(livro1);
        jose.adicionarLivro(livro2);

        jose.exibirAutor();
    }
}
