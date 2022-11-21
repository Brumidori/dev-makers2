import java.util.ArrayList;

public class TesteAluno {

    public static void main(String[] args) {
        Aluno ana = new Aluno();
        ana.setN1(9);
        ana.setN2(3);
        ana.setN3(8);
        ana.setN4(7);
        ana.setMatricula(1);

        Aluno breno = new Aluno();
        breno.setN1(1);
        breno.setN2(10);
        breno.setN3(6);
        breno.setN4(8);
        breno.setMatricula(2);


        Aluno clara = new Aluno();
        clara.setN1(1);
        clara.setN2(2);
        clara.setN3(3);
        clara.setN4(4);
        clara.setMatricula(3);

        Aluno dani = new Aluno();
        dani.setN1(1);
        dani.setN2(4);
        dani.setN3(5);
        dani.setN4(9);
        dani.setMatricula(4);

        Aluno elise = new Aluno();
        elise.setN1(9);
        elise.setN2(7);
        elise.setN3(8);
        elise.setN4(9);
        elise.setMatricula(5);

        ArrayList<Aluno> turma = new ArrayList<Aluno>();
        turma.add(ana);
        turma.add(breno);
        turma.add(clara);
        turma.add(dani);
        turma.add(elise);

        for (Aluno a : turma) {
            System.out.println("Aluno: " + a.getMatricula() + ";\nNotas: " + a.getN1() + ", " + a.getN2() + ", " + a.getN3() + ", " + a.getN4());}

        System.out.println("----------------------------------------------------------------");

        for (Aluno a : turma) {
            System.out.println("Aluno: " + a.getMatricula() + ";\nMédia: " + Aluno.media(a));
        }
    }
}
