package estudando.colecaoComArrayList.ex06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Peter Pan", 20.89);
        Livro l2 = new Livro("João e Maria", 30.95);
        Livro l3 = new Livro("Os três porquinhos", 12.50);

        List<Livro> livros = new ArrayList<>();
        livros.add(l1);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(livros);
        carrinhoDeCompras.listarItens();

        carrinhoDeCompras.adicionarItem(l2);
        carrinhoDeCompras.calcularTotal();
        carrinhoDeCompras.adicionarItem(l3);
        carrinhoDeCompras.calcularTotal();
        carrinhoDeCompras.listarItens();
    }
}
