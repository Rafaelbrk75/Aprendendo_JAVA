package POO.Aula03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestAula3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Digite o saldo da sua conta: ");
            double saldo = input.nextDouble();

            System.out.println("Digite o desconto: ");
            double desconto = input.nextDouble();

            double resultado = saldo - desconto;

            if(resultado < 0){
                throw new ValorMenorQueZeroException("Pagamento Orçamentario");
            }else
                saldo = resultado;

        }catch (InputMismatchException e){
            System.out.println("Valor invalido");
        }catch (ValorMenorQueZeroException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finalizando...");
        }

    }
}
