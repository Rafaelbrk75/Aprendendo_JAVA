package ex03;

public class Motor {
    private int potencia;
    public String tipoCombustivel;

    public Motor(int potencia, String tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    public void exibirDetalhes() {
        System.out.printf("Potencia: %d\n", potencia);
        System.out.printf("Tipo de combustivel: %s\n", tipoCombustivel);
    }
}
