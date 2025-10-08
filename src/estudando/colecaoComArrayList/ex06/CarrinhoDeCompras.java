package estudando.colecaoComArrayList.ex06;

import java.util.List;

public class CarrinhoDeCompras {
    private List<Livro> itens;

    public CarrinhoDeCompras(List<Livro> itens) {
        this.itens = itens;
    }

    void adicionarItem (Livro livro){
        this.itens.add(livro);
    }

    void removerItem (Livro livro) {
        this.itens.remove(livro);
    }

    void listarItens (){
        System.out.println("Livros: ");
        for (Livro livro : itens) {
            System.out.printf("Nome: %s\n", livro.getNome());
        }
    }

    void calcularTotal(){
        double total =0;
        if (this.itens.size() > 0){
            for (Livro livro : itens) {
                total += livro.getPreco();
            }
            System.out.printf("Valor total: %f\n", total);
        }else {
            System.out.println("Carrinho vazio");
        }


    }

}
