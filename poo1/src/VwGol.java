public class VwGol {

    int anoFabricao;
    String cor;
    int qtdePortas;
    boolean ligado = false;

    public VwGol(int anoFabricao, String cor, int qtdePortas, boolean ligado) {
        this.anoFabricao = anoFabricao;
        this.cor = cor;
        this.qtdePortas = qtdePortas;
        this.ligado = ligado;
    }

    public VwGol(int anoFabricao, String cor){
        this.anoFabricao = anoFabricao;
        this.cor = cor;
    }

    public static VwGol montar() {
        // Contexto static pertence a classe e não ao objeto
        return new VwGol();
    }

    public void ligar() {
        // Sem a palavra static o método pertence ao contexto do objeto
        // e não da classe
        // A palavra 'this' referencia o objeto que estou manipulando
        this.ligado = true;
    }
}
