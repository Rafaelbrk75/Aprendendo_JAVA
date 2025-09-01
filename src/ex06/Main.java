package ex06;

public class Main {
    public static void main(String[] args) {
        Comodo[] lista = {
                new Comodo("Sala"),
                new Comodo("Cozinha"),
                new Comodo("Quarto")
        };

        Casa casa = new Casa( lista, "Avenida Brasil, 123");
        casa.listarComodos();
    }
}
