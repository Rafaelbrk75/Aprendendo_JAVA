package POO.Ex02;

public class Livro {
    private String nomeLivro;
    private String autor;
    private double preco;

    public Livro(String nomeLivro, String autor, double preco) {
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.preco = preco;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
