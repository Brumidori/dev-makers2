import java.util.ArrayList;

public class TesteAluno {

    public static void main(String[] args) {
        Aluno ana = new Aluno();
        ana.notas[0] = 9.0;
        ana.notas[1] = 7.0;
        ana.notas[2] = 8.0;
        ana.notas[3] = 9.0;
        ana.setMatricula(1);

        Aluno breno = new Aluno();
        breno.notas[0] = 9.0;
        breno.notas[1] = 4.0;
        breno.notas[2] = 8.0;
        breno.notas[3] = 5.0;
        breno.setMatricula(2);


        Aluno clara = new Aluno();
        clara.notas[1] = 7.0;
        clara.notas[2] = 4.0;
        clara.notas[3] = 3.0;
        clara.notas[0] = 1.0;
        clara.setMatricula(3);

        Aluno dani = new Aluno();
        dani.notas[0] = 9.0;
        dani.notas[1] = 3.0;
        dani.notas[2] = 4.0;
        dani.notas[3] = 0.0;
        dani.setMatricula(4);

        Aluno elise = new Aluno();
        elise.notas[0] = 9.0;
        elise.notas[1] = 8.0;
        elise.notas[2] = 6.0;
        elise.notas[3] = 5.0;
        elise.setMatricula(5);

        ArrayList<Aluno> turma = new ArrayList<Aluno>();
        turma.add(ana);
        turma.add(breno);
        turma.add(clara);
        turma.add(dani);
        turma.add(elise);

        for (Aluno a : turma) {
            System.out.println("Aluno: " + a.getMatricula());
            for (double nota : a.notas
            ) {
                System.out.println("Notas: " + nota);
            }
        }

            System.out.println("----------------------------------------------------------------");

            for (Aluno a : turma) {
                System.out.println("Aluno: " + a.getMatricula() + ";\nMédia: " + Aluno.media(a));
            }
        }
    }
