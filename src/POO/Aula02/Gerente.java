package POO.Aula02;

public class Gerente extends Funcionario {
    private String setorResponsavel;

    public Gerente(String nome, String cpf, double salario, String setorResponsavel) {
        super(nome, cpf, salario);
        this.setorResponsavel = setorResponsavel;
    }

    @Override
    public double getBonus() {
        return this.getSalario()*0.15;
    }

    @Override
    public String toString() {
        return super.toString() +"\nSetor Responsavel: " + this.setorResponsavel;
    }
}
