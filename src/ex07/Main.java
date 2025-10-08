package ex07;

public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Carlos");

        Disciplina d1 = new Disciplina("POO");
        Disciplina d2 = new Disciplina("Estruturas de Dados");
        Disciplina d3 = new Disciplina("Banco de Dados");

        p1.associarDisciplina(d1);
        p1.associarDisciplina(d2);
        p1.associarDisciplina(d3);

        p1.listarDisciplinas();

        System.out.println(d1.getNome() + " → " + d1.getProfessor().getNome());
        System.out.println(d2.getNome() + " → " + d2.getProfessor().getNome());
        System.out.println(d3.getNome() + " → " + d3.getProfessor().getNome());
    }
}

