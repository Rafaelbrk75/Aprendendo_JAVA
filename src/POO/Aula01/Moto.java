package POO.Aula01;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "cilindradas=" + cilindradas;
    }
}
