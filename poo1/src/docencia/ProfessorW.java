package docencia;

import java.util.ArrayList;
import java.util.UUID;

public class ProfessorW {

    public String nome;

    public String matricula;

    public Double valorHoraAula;

    public ArrayList<String> disciplinas = new ArrayList<>();

    public ArrayList<String> turmas = new ArrayList<>();

    public ArrayList<AlunoW> alunos = new ArrayList<>();

    public ProfessorW(String nome, ArrayList<String> disciplinas) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>(disciplinas);
        this.matricula = UUID.randomUUID().toString();
    }

    public ProfessorW(String nome, Double valorHoraAula, ArrayList<String> disciplinas) {
        this(nome, disciplinas);
        this.valorHoraAula = valorHoraAula;
    }

    public void ministrarAula(String turma, String disciplina) {
        System.out.println("O professor " + nome + " ministrou a aula de " +
                disciplina + " na turma " + turma);
        for (AlunoW aluno : this.alunos) {
            //Essa chamada só é possível devido ao aluno esta no mesmo pacote que o professor
            aluno.darAtencaoAula();
        }
    }

    public void corrirgirAtividade(String turma, String disciplina, String atividade) {
        System.out.println("O professor " + nome + " corrigiu o atividade " +
                atividade + " da turma " + turma + " e disciplina " + disciplina);
    }

}