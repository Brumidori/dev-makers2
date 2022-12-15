package dice;

public class DadoVerde extends Dado{

    public DadoVerde() {
        super(new Face[]{
                Face.CEREBRO,
                Face.PASSOS,
                Face.TIRO,
                Face.CEREBRO,
                Face.PASSOS,
                Face.CEREBRO,

        });
    }

    @Override
    public TipoDado getTipoDado() {
        return TipoDado.VERDE;
    }
}
