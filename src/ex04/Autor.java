package ex04;

public class Autor {
    private String nome;
    private String nacionalidade;
    public Livro[] livros;

    public Autor(String nacionalidade, String nome) {
        this.nacionalidade = nacionalidade;
        this.nome = nome;
        this.livros = new Livro[10];
    }

    public Autor(String nacionalidade, String nome, Livro[] livros) {
        this.nacionalidade = nacionalidade;
        this.nome = nome;
        this.livros = livros;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirAutor() {
        System.out.println("Autor: " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);

        if (livros == null || livros.length == 0) {
            System.out.println("Sem livros cadastrados.");
            return;
        }

        for (Livro l : livros) {
            if (l != null) {
                l.exibirLivro();
            }
        }
    }
}
