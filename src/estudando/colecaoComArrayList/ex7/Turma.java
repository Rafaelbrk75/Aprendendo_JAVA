package estudando.colecaoComArrayList.ex7;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.Aluno;

import java.util.List;

public class Turma {
    private List<Aluno> alunos;

    public Turma(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    void listarAlunos() {
        System.out.println("Listando alunos:");
        for (Aluno aluno :this.alunos) {
            System.out.printf("Nome: %s\n", aluno.getNome());
        }
    }

    public int getNumeroDeAlunos() {
        return this.alunos.size();
    }

    public Aluno getAlunoNaPosica(int indice) {
        return this.alunos.get(indice);
    }

    public void removerAluno (Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void buscarAluno (int ra) {
        for (Aluno aluno : this.alunos) {
            if (aluno.getRa() == ra) {
                System.out.println("Aluno: " + aluno.getNome());
                return;
            }
        }
        System.out.println("Esse aluno não existe!");
    }
}
