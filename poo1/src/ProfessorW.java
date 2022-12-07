import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class ProfessorW {
    
    String nome;
    String registro;
    List<String> turma = new ArrayList<String>();
    List<String> disciplina = new ArrayList<String>();
    int salario;
    
    public static ProfessorW registrar(String nome, String turma, String disciplina, int salario) {
        ProfessorW professor = new ProfessorW();
        professor.registro = UUID.randomUUID().toString();
        professor.nome = nome;
        professor.turma = Collections.singletonList(turma);
        professor.disciplina = Collections.singletonList(disciplina);
        professor.salario = salario;
        return professor;
    }
    
    public void darAula (){
        String LocalDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("O professor "+ nome + " deu a disciplina de " + disciplina + " no dia " + LocalDate);
    }

    public void atribuirNota(AlunoW aluno, double nota){
        System.out.println(aluno.nome + " recebeu a nota: " + nota+ " na disciplina de " + disciplina);
    }

    public void corrigirAtividade(String turmal, String disciplina, String atividade){
        System.out.println("O professor "+ nome + " corrigiu o trabalho " + atividade + " da turma " + turma +
                " e disciplina " + disciplina);
    }
}
