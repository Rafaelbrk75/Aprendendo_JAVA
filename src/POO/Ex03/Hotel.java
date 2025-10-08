package POO.Ex03;

import java.util.ArrayList;

public class Hotel {
    private String nome;
    private String endereco;
    private ArrayList<Quarto> quartos;

    public Hotel(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto){
        this.quartos.add(quarto);
    }

    private Quarto buscarPorNumero(int numero) {
        for (Quarto q : quartos) {
            if (q.getNumero() == numero) {
                return q;
            }
        }
        return null;
    }


    public void hospedar(Hospede hospede, int numeroQuarto){
        Quarto q = buscarPorNumero(numeroQuarto);
        if (q == null) {
            System.out.println("Quarto " + numeroQuarto + " não existe.");
            return;
        }
        if (q.isOcupado()) {
            System.out.println("Quarto " + numeroQuarto + " já está ocupado.");
            return;
        }
        q.ocupar(hospede);
    }

    public void realizarCheckout(int numeroQuarto){
        for (Quarto quarto : this.quartos) {
            if(quarto.getNumero() == numeroQuarto){
                quarto.liberar();
                return;
            } else{
                System.out.printf("Quarto %d não encontrado!", numeroQuarto);
            }
        }

    }

    public void exibirRelatorioOcupacao() {
        for (Quarto quarto : this.quartos) {
            String situacao = quarto.isOcupado() ? "Ocupado" : "Livre";

            System.out.printf("Quarto: %d | Tipo: %s | Situação: %s%n",
                    quarto.getNumero(), quarto.getTipo(), situacao);

            if (quarto.isOcupado() && quarto.getHospedeAtual() != null) {
                System.out.printf("   Hóspede: %s | CPF: %s%n",
                        quarto.getHospedeAtual().getNome(),
                        quarto.getHospedeAtual().getCpf());
            }
            System.out.println();
        }

    }

}
