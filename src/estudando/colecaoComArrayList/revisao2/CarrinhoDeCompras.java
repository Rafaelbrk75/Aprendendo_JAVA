package estudando.colecaoComArrayList.revisao2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Livro> itens;

    public CarrinhoDeCompras(List<Livro> itens) {
        this.itens = new ArrayList<>(itens);
    }

    public void adicionarItem(Livro livro) {
        this.itens.add(livro);
        System.out.println("Livro adicionado");
    }

    public void removerItem(Livro livro){
        this.itens.remove(livro);
        System.out.printf("Livro %s removido\n", livro.getNome());
    }

    public void listarItens() {
        System.out.println("Lista dos livros");
        for (Livro livro : itens) {
            System.out.printf("Livro: %s \nAutor: %s \nValor: %f\n", livro.getNome(), livro.getAutor(), livro.getValor());
        }
    }

    public void calcularTotal() {
        double total = 0;
        if(itens.isEmpty()) {
            System.out.printf("Valor total: %f\n", total);
        } else{
            for(Livro livro : itens) {
                total += livro.getValor();
            }
            System.out.printf("Valor total: %f\n", total);
        }
    }

}
