package POO.Aula02;

public class Funcionario extends Pessoa{
    double salario;

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getBonus(){
        return this.salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalario: " + this.salario;
    }
}
