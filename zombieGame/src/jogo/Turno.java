package jogo;

import bag.PoteDado;
import dice.Dado;
import dice.Face;
import zombies.Jogador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turno {

    Scanner scanner = new Scanner(System.in);

    private List<Dado> dadosUtilizadosNoTurno;
    private int qtdeCerebros;
    private int qtdeTiros;
    private Jogador jogador;
    private PoteDado pote;

    public Turno(Jogador jogador, PoteDado pote) {
        this.jogador = jogador;
        this.pote = pote;
        this.qtdeCerebros = 0;
        this.qtdeTiros = 0;
        this.dadosUtilizadosNoTurno = new ArrayList<>();
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        String continuarJogando = "n";
        ArrayList<Dado> dadosASeremRelancados = new ArrayList<>();
        System.out.println("Jogador " + jogador.getNome() +
                " é sua vez, realize uma jogada.");
        do {
            List<Dado> dadosLancados = jogador.lancarDados(pote, dadosASeremRelancados);
            dadosASeremRelancados.clear();
            for (Dado dado : dadosLancados) {
                boolean dadoContabilizado = contabilizarDadoJogado(dado);
                if (!dadoContabilizado) {
                    dadosASeremRelancados.add(dado);
                }
            }
            boolean forcarEncerramento = forcarEncerramentoTurno();
            if (forcarEncerramento) {
                if (qtdeTiros < 3) {
                    System.out.println("------------------------------------------------------");
                    System.out.println("Turno será encerrado pois você atingiu 13 cerebros consumidos");
                } else {
                    System.out.println("------------------------------------------------------");
                    System.out.println("Turno será encerrado pois você levou " + qtdeTiros + " tiros");
                }
                break;
            }
            System.out.println("Pontuação atual: " + (jogador.getQtdeCerebros() + qtdeCerebros) +
                    " cerebros consumidos, " + qtdeTiros + " tiros levados");
            System.out.println("------------------------------------------------------");
            System.out.println(jogador.getNome() + " deseja jogar novamente?(s/n)");
            continuarJogando = scanner.nextLine();
        } while (continuarJogando.equalsIgnoreCase("s"));
        contabilizarTurno();
        pote.devolverDado(dadosUtilizadosNoTurno);
        pote.devolverDado(dadosASeremRelancados);
    }

    private boolean forcarEncerramentoTurno() {
        return qtdeTiros >= 3 || jogador.getQtdeCerebros() + qtdeCerebros >= 13;
    }

    private boolean contabilizarDadoJogado(Dado dado) {
        System.out.println("Você lançou o dado " + dado.getTipoDado() +
                " e obteve o resultado " + dado.getFaceSorteada());
        boolean contabilizado = dado.getFaceSorteada() != Face.PASSOS;
        if (contabilizado) {
            dadosUtilizadosNoTurno.add(dado);
            if (dado.getFaceSorteada() == Face.CEREBRO) {
                qtdeCerebros++;
            } else {
                qtdeTiros++;
            }
        }
        return contabilizado;
    }

    private void contabilizarTurno() {
        if (qtdeTiros < 3) {
            int qtdeCerebrosAtual = jogador.getQtdeCerebros();
            int novaQtdeCerebrosConsumidos = qtdeCerebrosAtual + qtdeCerebros;
            jogador.setQtdeCerebros(novaQtdeCerebrosConsumidos);
            System.out.println("Contabilizado turno do jogador: " + jogador.getNome() +
                    ", encerrado com um total de " + novaQtdeCerebrosConsumidos +
                    " cerebros consumidos");
        }
    }

}