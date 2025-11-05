package POO.Aula03;

public class ValorMenorQueZeroException extends Exception {
    public ValorMenorQueZeroException(String message) {
        super("Não é permitido saldo negativo" + message);
    }
}
