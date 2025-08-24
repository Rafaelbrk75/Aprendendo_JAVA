package academy.devdojo.maratona.introducao.classes;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setNome("Rafael");
        f.setIdade(19);
        f.setSalarios(new double[]{1200, 978, 32, 2000});
        f.imprimir();
    }
}
