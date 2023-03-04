import java.util.function.Function;

public class FunctionInterface {
    public static int dobro(int numero) {
        Function<Integer, Integer> dobro = n -> n * 2;
        return dobro.apply(numero);
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = dobro(numero);
        System.out.println("O dobro de " + numero + " é " + resultado);
    }
}
