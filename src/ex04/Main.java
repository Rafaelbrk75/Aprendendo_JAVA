package ex04;

public class Main {
    public static void main(String[] args) {
        Autor jose = new Autor("Brasileiro", "Jose");
        Livro livro1 = new Livro("João é o pé de feijão", jose);

        Livro livros[];
        livros = new Livro[3];

        jose = new Autor("Brasileiro", "Jose", livros);

        System.out.println("Eu quero que o meu video fique legal");
        System.out.println("Mas eu não sei como fazer  isso  hahshsassss");
    }
}