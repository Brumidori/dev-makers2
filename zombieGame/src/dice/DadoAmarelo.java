package dice;

public class DadoAmarelo extends Dado{

    public DadoAmarelo() {
        super( new Face[]{
                Face.CEREBRO,
                Face.PASSOS,
                Face.TIRO,
                Face.CEREBRO,
                Face.PASSOS,
                Face.TIRO,

        });
    }

    @Override
    public TipoDado getTipoDado() {
        return TipoDado.AMARELO;
    }
}
