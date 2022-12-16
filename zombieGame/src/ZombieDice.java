import bag.PoteDado;
import dice.Dado;
import dice.DadoAmarelo;
import dice.DadoVerde;
import dice.DadoVermelho;
import jogo.Turno;
import zombies.Jogador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZombieDice {

    private List<Jogador> jogadores;

    private int posicaoJogadorNaLista;

    public ZombieDice() {
        jogadores = new ArrayList<>();
        posicaoJogadorNaLista = 0;
    }

    public void cadastrarJogadores() {
        Scanner scanner = new Scanner(System.in);
        String continuarCadastrado = "n";

        do {
            System.out.println("Informe o nome do jogador:");
            String nome = scanner.nextLine();
            Jogador jogador = new Jogador(nome);
            jogadores.add(jogador);
            System.out.println("Cadastrar um novo jogador?(s/n)");
            continuarCadastrado = scanner.nextLine();
        } while (continuarCadastrado.equalsIgnoreCase("s"));
    }

    public void iniciarPartida() {
        cadastrarJogadores();
        if (jogadores.size() < 2) {
            System.out.println("Você deve cadastrar no minimo 2 jogadores");
            cadastrarJogadores();
        }
        PoteDado pote = criarPote();

        Jogador jogadorAtual = jogadores.get(posicaoJogadorNaLista);
        Turno turnoAtual = new Turno(jogadorAtual, pote);
        turnoAtual.jogar();
    }

    public PoteDado criarPote() {
        ArrayList<Dado> dados = new ArrayList<>();

        dados.add(new DadoVerde());
        dados.add(new DadoVerde());
        dados.add(new DadoVerde());
        dados.add(new DadoVerde());
        dados.add(new DadoVerde());
        dados.add(new DadoVerde());

        dados.add(new DadoAmarelo());
        dados.add(new DadoAmarelo());
        dados.add(new DadoAmarelo());
        dados.add(new DadoAmarelo());

        dados.add(new DadoVermelho());
        dados.add(new DadoVermelho());
        dados.add(new DadoVermelho());

        PoteDado pote = new PoteDado(dados);
        return pote;
    }

    public static void main(String[] args) {
    }
}





