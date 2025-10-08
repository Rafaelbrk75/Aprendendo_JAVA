package academy.devdojo.maratona.javacore.Gassociacao.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private int ra;
    private Seminario seminario;

    public Aluno(int idade, String nome, int ra) {
        this.idade = idade;
        this.nome = nome;
        this.ra = ra;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }


}
