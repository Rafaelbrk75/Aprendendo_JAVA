package ex08;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto) {
        if (this.produtos == null) {
            this.produtos = new ArrayList<>();
        }
        this.produtos.add(produto);
    }

    public void mostrarDetalhes() {
        System.out.printf("Pedidos do cliente: %s CPF: %s\n", cliente.getNome(), cliente.getCpf());
        if (this.produtos == null || this.produtos.isEmpty()) {
            System.out.println("Nenhum produto encontrado");
        } else  {
            double total = 0;
            for (Produto produto : this.produtos) {
                System.out.println(produto.getNome() + " - R$ " + String.format("%.2f", produto.getPreco()));
                total += produto.getPreco();
            }
            System.out.println("Valor total: " + String.format("%.2f", total));
        }
    }
}
