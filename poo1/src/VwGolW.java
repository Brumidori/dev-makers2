
public class VwGolW {

    public static int numeroDoProjeto = 54;

    private int anoFabricacao;

    private String cor;

    private int qtdePortas;

    private boolean arCondicionado;

    private boolean ligado = false;

    //Mesmo sem que seja escrito o código desse construtor o Java cria quando não há outro
    public VwGolW(int anoFabricacao, String cor, int qtdePortas) {
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.qtdePortas = qtdePortas;
    }

    public VwGolW(int anoFabricacao, String cor, int qtdePortas, boolean arCondicionado) {
        this(anoFabricacao, cor, qtdePortas);
        this.arCondicionado = arCondicionado;
    }

    //get and set
    // get -> recupera o valor
    // set -> atribui o valor
    public int getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor/*novaCor*/) {
        this.cor = cor;
    }

    public int getQtdePortas() {
        return this.qtdePortas;
    }

    public boolean getArCondicionado() {
        return this.arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public void ligar() {
        // Sem a palavra static o método pertence ao contexto do objeto
        // e não da classe
        // A palavra 'this' referencia o objeto que estou manipulando
        habilitarCircuitosEletricos();
        this.ligado = true;
    }

    private void habilitarCircuitosEletricos() {
        System.out.println("Circuitos eletricos habilitados");
    }

}
