import java.util.ArrayList;
import java.util.UUID;

public class AlunoW {

    String matricula;
    String nome;
    ArrayList<Integer> notas = new ArrayList<Integer>();
    int presenca;
    String curso;

    public static AlunoW matricular(String nome, String curso) {
        AlunoW aluno = new AlunoW();
        //aluno.matricula = String.valueOf(System.currentTimeMillis()); //usar com cuidado nos loops
        aluno.matricula = UUID.randomUUID().toString();
        aluno.nome = nome;
        aluno.curso = curso;
        return aluno;
    }

    public ArrayList<Integer> inserirNota() {
        return notas;
    }

    public void assistirAula(String disciplina) {
        System.out.println("O aluno " + nome + " assistiu a aula de " +
                disciplina + " no curso de " + curso);
    }

    public void realizarAtividade(String displina, String atividade) {
        System.out.println("O aluno " + nome + " realizou a atividade " +
                atividade + " na disciplina " + displina + " no curso " + curso);
    }

}
