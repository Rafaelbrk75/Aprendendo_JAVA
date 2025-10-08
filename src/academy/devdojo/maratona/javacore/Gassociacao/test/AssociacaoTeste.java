package academy.devdojo.maratona.javacore.Gassociacao.test;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua rio das varzas");
        Aluno aluno = new Aluno(19, "Luffy", 322382283);
        Professor professor = new Professor("Pirata", "Barba branca");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario(alunosParaSeminario, local,"Onde achar one piece");

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
    }
}
