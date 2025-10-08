package ex07;


import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Disciplina> disciplinas;

    public Professor(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void listarDisciplinas() {
        System.out.println("Professor " + nome + " leciona:");
        if (disciplinas.isEmpty()) {
            System.out.println("- Nenhuma disciplina");
        } else {
            for (Disciplina d : disciplinas) {
                System.out.println("- " + d.getNome());
            }
        }
    }

    public void associarDisciplina(Disciplina d) {
        if (!disciplinas.contains(d)) {
            disciplinas.add(d);
            d.setProfessor(this);
        }
    }
}
