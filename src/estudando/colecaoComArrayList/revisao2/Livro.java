package estudando.colecaoComArrayList.revisao2;

public class Livro {
    private String nome;
    private String autor;
    private double valor;

    public Livro(String nome, String autor, double valor) {
        this.nome = nome;
        this.autor = autor;
        this.valor = valor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
