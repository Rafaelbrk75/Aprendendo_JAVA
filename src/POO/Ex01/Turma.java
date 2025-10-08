package POO.Ex01;

public class Turma {
    private Aluno[] alunos;
    private int quantidade;
    private int proximaPosicaoLivre;

    public Turma(Aluno[] alunos, int quantidade) {
        this.alunos = new Aluno[quantidade];
    }

    public void matricular(Aluno aluno){
        if(this.alunos.length == quantidade) {
            System.out.println("Quantidade execedida!");
        } else {
            this.alunos[this.proximaPosicaoLivre] = aluno;
        }
    }

    public Aluno buscarAlunoPorRa(int ra) {
        for (int i = 0; i < this.proximaPosicaoLivre; i++) {
            Aluno atual = this.alunos[i];
            if (atual != null && atual.getRa() == ra) {
                return atual;
            }
        }
        return null;
    }

    public void listar (){
        for(Aluno aluno : alunos){
            System.out.println("Aluno: " + aluno);
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public int getProximaPosicaoLivre() {
        return proximaPosicaoLivre;
    }

    public void setProximaPosicaoLivre(int proximaPosicaoLivre) {
        this.proximaPosicaoLivre = proximaPosicaoLivre;
    }
}
