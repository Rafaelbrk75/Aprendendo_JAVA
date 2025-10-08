package ex04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Autor {
    private String nome;
    private String nacionalidade;
    private final List<Livro> livros; // coleção dinâmica

    // Construtor (ordem: nacionalidade, nome)
    public Autor(String nacionalidade, String nome) {
        this.nacionalidade = nacionalidade;
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    // Construtor com livros (copia defensiva)
    public Autor(String nacionalidade, String nome, List<Livro> livros) {
        this(nacionalidade, nome);
        if (livros != null) this.livros.addAll(livros);
    }

    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    // Evita que chamador altere a lista por fora
    public List<Livro> getLivros() { return Collections.unmodifiableList(livros); }

    // ---- melhorias úteis ----
    public void adicionarLivro(Livro livro) {
        if (livro != null && !livros.contains(livro)) {
            livros.add(livro);
        }
    }

    public boolean removerLivro(Livro livro) {
        return livros.remove(livro);
    }

    public void exibirAutor() {
        System.out.println("Autor: " + nome);
        System.out.println("Nacionalidade: " + nacionalidade);

        if (livros.isEmpty()) {
            System.out.println("Sem livros cadastrados.");
            return;
        }
        System.out.println("Livros:");
        for (Livro l : livros) {
            if (l != null) {
                System.out.println("- " + l);
            }
        }
    }
}
