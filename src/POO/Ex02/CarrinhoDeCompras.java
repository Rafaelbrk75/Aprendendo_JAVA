package POO.Ex02;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Livro> livros;

    public CarrinhoDeCompras() {
        this.livros = new ArrayList<>();
    }

    public void adicionarItem(Livro livro) {
        this.livros.add(livro);
    }

    public void removerItem(Livro livro) {
        System.out.println("Removendo livro: " + livro.getNomeLivro());
        this.livros.remove(livro);

    }

    public void listarItems() {
        for (Livro livro : this.livros) {
            System.out.printf("Nome %s - Autor: %s - Preco: %f\n", livro.getNomeLivro(), livro.getAutor(), livro.getPreco());
        }
    }

    public double calcularTotal() {
        double total = 0;

        for (Livro livro : this.livros) {
            total += livro.getPreco();
        }

        return total;
    }
}
