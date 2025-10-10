package POO.Ex02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Código limpo", "Bob", 79.89);
        Livro livro2 = new Livro("Icarly", "Nickelodeon", 39.59);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem(livro1);
        carrinhoDeCompras.adicionarItem(livro2);

        double total = carrinhoDeCompras.calcularTotal();

        System.out.println("Total de compras: " + total);

        carrinhoDeCompras.removerItem(livro1);

        total = carrinhoDeCompras.calcularTotal();

        System.out.println("Total de compras: " + total);

    }
}
