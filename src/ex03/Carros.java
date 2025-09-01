package ex03;

public class Carros {
    String modelo;
    String marca;
    Motor motor;

    public Carros(String marca, String modelo, int potenciaCarro, String tipoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        motor = new Motor(potenciaCarro, tipoCombustivel);
    }

    public void printValores() {
        System.out.printf("Modelo: %s\n", modelo);
        System.out.printf("Marca: %s\n", marca);
        System.out.println("ex03.Motor");
        motor.exibirDetalhes();
    }

}
