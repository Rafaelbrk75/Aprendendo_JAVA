package estudando.colecaoComArrayList.ex7;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.Aluno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(19, "Rafael",323232);
        Aluno aluno2 = new Aluno(18, "Rafaela", 2324341);
        Aluno aluno3 = new Aluno(19, "Bruno", 241326142);

        List<Aluno> alunos = new ArrayList<>();
        alunos.addAll(Arrays.asList(aluno, aluno2, aluno3));

        Turma turma = new Turma(alunos);

        System.out.println(turma.getNumeroDeAlunos());
        turma.listarAlunos();
        System.out.println(turma.getAlunoNaPosica(1).getNome());

        turma.removerAluno(aluno2);
        turma.listarAlunos();
    }
}
