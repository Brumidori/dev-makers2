package bag;

import dice.Dado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PoteDado {

    private List<Dado> dados;

    public PoteDado(List<Dado> dados) {
        this.dados = dados;
    }

    public void embaralhar() {
        Collections.shuffle(dados);
    }

    public List<Dado> entregarDado(int qtde) {
        List<Dado> buffer = new ArrayList<Dado>();
        int contador = qtde;
        while (contador > 0 ) {
            Dado removido = this.dados.remove(0);
            buffer.add(removido);
            contador--;
        }
        return buffer;
    }

    public void devolverDado(List<Dado> dados){
        for(Dado dado : dados){
            dado.resetFaceSorteada();
        }
        this.dados.addAll(dados);
    }
}
