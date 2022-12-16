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
        String continuarJogando = "n";
        List<Dado> dadosASeremRelancados = new ArrayList<>();
        do {
            System.out.println("Jogador " + jogador.getNome() + " eh a sua vez, realize uma acao");
            List<Dado> dadosLancados = jogador.lancarDados(pote, dadosASeremRelancados);
            dadosASeremRelancados.clear();
            for (Dado dado : dadosLancados) {
                System.out.println("Voce lancou o dado " + dado.getTipoDado() +
                        "e obteve o resultado " + dado.getFaceSorteada());
                boolean dadoContabilizado = contabilizarDadoJogado(dado);
                if(!dadoContabilizado){
                    dadosASeremRelancados.add(dado);
                }
            }
            boolean forcarEncerramento = forcarEncerramentoTurno();
            if(forcarEncerramento){
                break;
            }
            System.out.println(qtdeCerebros + " cerebros consumidos, " + qtdeTiros + " tiros levados" );
            System.out.println(jogador.getNome() + " gostaria de continuar a jogada? (s/n)");
            continuarJogando = scanner.nextLine();
        } while (continuarJogando.equalsIgnoreCase("s"));
        contabilizarTurno();
        pote.devolverDado(dadosUtilizadosNoTurno);
        pote.devolverDado(dadosASeremRelancados);
    }

    private boolean forcarEncerramentoTurno() {
        return qtdeTiros >= 3 || qtdeCerebros >= 13;
    }

    private boolean contabilizarDadoJogado(Dado dado) {
        boolean contabilizado = dado.getFaceSorteada() != Face.PASSOS;
        if (contabilizado) {
            dadosUtilizadosNoTurno.add(dado);
            if (dado.getFaceSorteada() == Face.CEREBRO) {
                System.out.println("Yeah, você consumiu mais um cerebro");
                qtdeCerebros++;
            } else {
                System.out.println("Mal dia, levou um tiro");
                qtdeTiros++;
            }
        } else {
            System.out.println("Vai precisar correr mais, sua presa fugiu");
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