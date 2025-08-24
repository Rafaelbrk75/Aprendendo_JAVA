package academy.devdojo.maratona.introducao.classes;

public class Pessoa {
    private String nome;
    private int idade;

    public void printPessoa(){
        System.out.println("Nome do Pessoa: " + this.nome);
        System.out.println("Idade do Pessoa: " + this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Idade inválida!");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
