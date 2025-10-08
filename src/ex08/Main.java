package ex08;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Rafael", "123.456.789-00");
        Produto p1 = new Produto("Fermento", 2.50);
        Produto p2 = new Produto("Macarrão", 5.80);

        Pedido pedido = new Pedido(cliente1);
        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);

        pedido.mostrarDetalhes();
    }
}
