package zombies;

import bag.PoteDado;
import dice.Dado;

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
        return null;
    }
}
