package dice;

public class DadoVermelho extends Dado {

    public DadoVermelho(Face[] faces) {
        super(new Face[]{
                Face.CEREBRO,
                Face.PASSOS,
                Face.TIRO,
                Face.TIRO,
                Face.PASSOS,
                Face.TIRO,
        });
    }

    @Override
    public TipoDado getTipoDado() {
        return TipoDado.VERMELHO;
    }
}
