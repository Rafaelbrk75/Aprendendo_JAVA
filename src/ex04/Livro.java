package ex04;

public class Livro {
    private String titulo;
    public Autor autor;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirLivro() {
        System.out.println("Livro: " + getTitulo());
    }
}
