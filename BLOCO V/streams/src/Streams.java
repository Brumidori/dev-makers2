import java.time.LocalTime;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        //INFINITAS

        Stream.generate(LocalTime::now)
                .filter(hora -> hora.getSecond() %2 == 0)
                .forEach(System.out::println);

        Stream.iterate(1, n -> n +2)
                .forEach(System.out::println);

        //iterate com condicao de parada
        Stream.iterate(2, (num) -> num <= 100, (num) -> num +2)
                .forEach(System.out::println);

        //criando stream vazia - para nao retornar nulo em funções
        Stream<String>  streamVazia = Stream.empty();

        Stream<Integer> streamDeUmElemento = Stream.of(1);

        //FINITAS


    }
}
