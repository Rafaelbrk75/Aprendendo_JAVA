package estudando.colecaoComArrayList.revisao;

import java.util.ArrayList;

public class Hotel {
    private String nome;
    private String endereco;
    private ArrayList<Quarto> quartos;

    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        this.quartos.add(quarto);
    }

    public void hospedar(Hospede hospede, int numeroQuarto) {
        for(Quarto quarto : quartos) {
            if(quarto.getNumero() == numeroQuarto){
                quarto.ocupar(hospede);
                return;
            }
        }
        System.out.println("Quarto não encontrado.");
    }

    public void realizarCheckout(int numeroQuarto){
        for (Quarto quarto : quartos){
            if(quarto.getNumero() == numeroQuarto){
                quarto.liberar();
                return;
            }
        }
    }

    public void exibirRelatorioOcupacao() {
        for(Quarto quarto : this.quartos) {
            System.out.printf("Quarto N: %d\n", quarto.getNumero());
            System.out.printf("Tipo: %s\n", quarto.getTipo());
            if(!quarto.isOcupado()){
                System.out.println("Ocupação: Vazio");
            } else {
                System.out.println("Ocupação: Em uso");
                System.out.printf("Hospede: %s\n", quarto.getHospedeAtual().getNome());
                System.out.printf("CPF: %s\n", quarto.getHospedeAtual().getCpf());
            }
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }

}
