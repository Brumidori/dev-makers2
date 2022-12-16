package zombies;

import bag.PoteDado;
import dice.Dado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jogador {

    private String nome;
    private int qtdeCerebros;
    private int qtdeTiros;

    public Jogador(String nome) {
        this.nome = nome;
        this.qtdeCerebros = 0;
        this.qtdeTiros = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setQtdeCerebros(int qtdeCerebros) {
        this.qtdeCerebros = qtdeCerebros;
    }

    public int getQtdeCerebros() {
        return qtdeCerebros;
    }

    public void setQtdeTiros(int qtdeTiros) {
        this.qtdeTiros = qtdeTiros;
    }

    public int getQtdeTiros() {
        return qtdeTiros;
    }

    public List<Dado> lancarDados(PoteDado pote, List<Dado> dadosSortearamPassosNaJogadaAnterior) {
        //3 quantidade base de dados
        int qtdeNecessario = 3 - dadosSortearamPassosNaJogadaAnterior.size();
        pote.embaralhar();
        List<Dado> dadosDoPote = pote.entregarDado(qtdeNecessario);
        List<Dado> dadosDisponiveis = new ArrayList<>(dadosDoPote);
        dadosDisponiveis.addAll(dadosSortearamPassosNaJogadaAnterior);
        for (Dado dado: dadosDisponiveis) {
            dado.jogar();
        }
        return dadosDisponiveis;
    }
}
