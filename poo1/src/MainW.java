import docencia.AlunoW;
import docencia.ProfessorW;

import java.util.ArrayList;

public class MainW {

    public static void main(String[] args) {
        //Consigo chamar o montar na classe, pois o método é desse contexto,
        // mas não consigo chamar o ligar, pois é do objeto
        VwGolW golDoDiego = new VwGolW(2022, "Preto", 5);
        System.out.println("A cor do gol do Diego é: " + golDoDiego.getCor());
        golDoDiego.setCor("Azul");
        System.out.println("A cor do gol do Diego é: " + golDoDiego.getCor());

        VwGolW golDoVitor = new VwGolW(2021, "Branca", 3, true);
        golDoVitor.setCor("Preto");
        System.out.println(golDoVitor.getAnoFabricacao());

        // Consigo chamar o ligar, pois o método é desse contexto.
        // Não consigo chamar o montar, pois é do contexto d class
        golDoDiego.ligar();
        System.out.println("Gol do Diego ligado");

        AlunoW richard = new AlunoW("Richard", "Dev_makers_2");
        richard.assistirAula("POO-1");

        AlunoW arthur = new AlunoW("Arthur", "Dev_makers_2");
        arthur.assistirAula("Banco de dados");

        AlunoW diego = new AlunoW("Diego", "Dev_makers_2");
        diego.assistirAula("POO-1");
        diego.receberAtividade("POO-1", "Trabalho-1");

        ArrayList<String> disciplinas = new ArrayList<>();
        disciplinas.add("POO-1");

        ProfessorW william = new ProfessorW("William", disciplinas);
        william.ministrarAula("Dev_makers_2", "POO-1");
        william.corrirgirAtividade("Dev_makers_2", "POO-1", "Trabalho-1");

        disciplinas.add("Banco de dados");
        ProfessorW thomas = new ProfessorW("Thomas", disciplinas);

        System.out.println("As disciplinas trabalhadas pelo William são: "+ william.disciplinas);
        System.out.println("As disciplinas trabalhadas pelo Thomas são: "+thomas.disciplinas);

        // método representam as ações possíveis de um objeto
        // atributos representam as propriedades dos objetos
    }


    /*
    Visibilidades
    publica (public) - Visível a todos sem distinção. Menos restritiva
    privada (private) - Visível apenas a quem esta na mesma class. Mais restritiva
    protegida (protected) - Visível a quem esta na mesma classe, quem herda e quem esta no mesmo pacote.
    pacote (package) (default) - Visível a quem esta na mesma classe e no mesmo pacote, mas não a quem herda.
     */

}
