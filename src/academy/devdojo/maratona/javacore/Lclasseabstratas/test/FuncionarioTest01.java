package academy.devdojo.maratona.javacore.Lclasseabstratas.test;

import academy.devdojo.maratona.javacore.Lclasseabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratona.javacore.Lclasseabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami",5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Toya",12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
