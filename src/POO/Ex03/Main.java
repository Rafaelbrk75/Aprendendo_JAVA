package POO.Ex03;

public class Main {
    public static void main(String[] args) {
        Hotel stark = new Hotel("Stark", "Rua Pindamonhangaba");

        Quarto quarto1 = new Quarto(1, "Standard", 250.80);
        Quarto quarto2 = new Quarto(2, "Suíte", 380.90);
        Quarto quarto3 = new Quarto(3, "Deluxe", 450.80);

        stark.adicionarQuarto(quarto1);
        stark.adicionarQuarto(quarto2);
        stark.adicionarQuarto(quarto3);

        Hospede hospede1 = new Hospede("Rafael", "456.234.654-78");
        Hospede hospede2 = new Hospede("Felipe", "976.864.346-98");

        stark.exibirRelatorioOcupacao();

        stark.hospedar(hospede1, 1);
        stark.hospedar(hospede2, 1);

        stark.hospedar(hospede2, 2);

        stark.exibirRelatorioOcupacao();

        stark.realizarCheckout(1);

        stark.exibirRelatorioOcupacao();
    }
}
