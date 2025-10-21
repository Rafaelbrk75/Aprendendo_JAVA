package POO.Aula02;

import java.util.ArrayList;
import java.util.List;

public class TestAula01 {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Jose", "2364", 1000.0, "Java");
        Gerente gerente = new Gerente("Pedro", "0304", 1000.0, "Aomoxarifado");
        Funcionario funcionario = new Funcionario("Douglas", "1002", 1000.0);

        System.out.println(funcionario);
        System.out.println("=====================");
        System.out.println(gerente);
        System.out.println("=====================");
        System.out.println(desenvolvedor);

        List<Funcionario> funcionarios = new ArrayList<>();

        for(int i=0; i<50; i++){
            Desenvolvedor novoDev = new Desenvolvedor("Cris", "2913", 8000.0, "PHP");
            funcionarios.add(novoDev);
        }

        for(int i=0; i<10; i++){
            Gerente novoGerente = new Gerente("Pedro", "0304", 1000.0, "Aomoxarifado");
            funcionarios.add(novoGerente);
        }

        for(int i=0; i<10; i++){
            Funcionario novoFuncionario = new Funcionario("Douglas", "1002", 1000.0);
            funcionarios.add(novoFuncionario);
        }
    }
}
