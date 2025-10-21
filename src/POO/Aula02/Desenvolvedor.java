package POO.Aula02;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, String cpf, double salario, String linguagemPrincipal) {
        super(nome, cpf, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public double getBonus() {
        return this.getSalario()*0.10;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLinguagem Principal: " + this.linguagemPrincipal;
    }
}
