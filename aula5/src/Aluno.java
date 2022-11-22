public class Aluno {

    private int matricula;
    double [] notas = new double[4];

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public static double media(Aluno a){
        double soma= 0;
        for (double nota: a.notas
             ) {
            soma += nota;
        }
        return (soma/4);

    }

}
