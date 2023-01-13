public class Main {
    public static void main(String[] args) {
        AlunoW bruna = AlunoW.matricular("Bruna", "Dev-makers-2" );
        bruna.assistirAula("POO-1");
        bruna.realizarAtividade("POO-1", "Trabalho-1");

        ProfessorW william = ProfessorW.registrar("William", "Dev-makers-2", "POO-1", 9000);
        william.darAula();

        william.atribuirNota(bruna, 7.7);

        VwGol carro1 = new VwGol(2012, "preto");
        VwGol carro2 = new VwGol(2022, "branco", 2, false);
    }
}
