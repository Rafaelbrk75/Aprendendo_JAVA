package estudando.colecaoComArrayList.revisao;

public class Main {
    public static void main(String[] args) {
        // (1) HOTEL
        Hotel hotel = new Hotel("Hotel Eclipse", "Av. Central, 100");

        // (2) QUARTOS (agora: numero, preco, tipo)
        hotel.adicionarQuarto(new Quarto(101, 250.0, "Standard"));
        hotel.adicionarQuarto(new Quarto(102, 320.0, "Luxo"));
        hotel.adicionarQuarto(new Quarto(201, 450.0, "Suíte"));

        // (3) HÓSPEDES
        Hospede h1 = new Hospede("Ana", "111.111.111-11");
        Hospede h2 = new Hospede("Bruno", "222.222.222-22");

        System.out.println("=== STATUS INICIAL ===");
        hotel.exibirRelatorioOcupacao();

        hotel.hospedar(h1, 101);

        hotel.hospedar(h2, 101);

        hotel.hospedar(h2, 102);

        System.out.println("=== APÓS HOSPEDAGENS ===");
        hotel.exibirRelatorioOcupacao();

        hotel.realizarCheckout(102);

        System.out.println("=== FINAL ===");
        hotel.exibirRelatorioOcupacao();
    }
}
