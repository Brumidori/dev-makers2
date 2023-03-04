import java.util.List;
import java.util.function.Consumer;


public class ConsumerClass {
    public static void imprimirLista(List<Integer> lista) {
        Consumer<Integer> printer = n -> System.out.print(n + " ");
        lista.forEach(printer);
    }

    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4, 5);
        imprimirLista(lista);
    }
}
