package academy.devdojo.maratona.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String especialidade, String nome) {
        this.especialidade = especialidade;
        this.nome = nome;
    }

    public Professor(String especialidade, String nome, Seminario[] seminarios) {
        this.especialidade = especialidade;
        this.nome = nome;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("---------------");
        System.out.println("Professor: " + this.nome);
        if(this.seminarios == null) return;
        System.out.println("Seminarios cadastrados ##");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno:" + aluno.getNome() + " idade: " + aluno.getIdade());
            }
        }

    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
