import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStream {

    //1) Filtragem de dados: dada uma lista de números inteiros
    //crie uma stream finita e use o método filter para retornar apenas os números pares.
    //____
    //2) Agregação de dados: dada uma lista de números inteiros
    //crie uma stream finita e use o método reduce para calcular a soma de todos os números.
    //___
    //3) Transformação de dados: dada uma lista de strings
    //crie uma stream finita e use o método map para convertê-las em números inteiros.
    //___
    //Jorge Lucas21:49
    //4) Ordenação de dados: dada uma lista de números inteiros
    //crie uma stream finita e use o método sorted para classificá-los em ordem crescente.
    //___
    //5) Crie o objeto Pessoa com os atributos nome:string e idade:integer
    //no metodo main inicialize uma lista de pessoas
    //use a stream para:
    // - filtrar somente pessoas com mais de 18 anos de idade
    // - tranformar em uma lista somente dos nomes dessas pessoas
    // - limitar a no máximo 3 resultados | limit()
    // - e retorne uma lista dessa stream
    //
    //imprima essa lista

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
        Stream<Integer> streamNumeros = numeros.stream();

        List<Integer> pares = streamNumeros.filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(pares); // Output: [2, 4, 6, 8, 10]

        Stream<Integer> streamNumeros2 = numeros.stream();
        Optional<Integer> soma = streamNumeros2.reduce((a, b) -> a + b);

        if (soma.isPresent()) {
            System.out.println(soma.get()); // Output: 55
        }


            List<Pessoa2> pessoas = new ArrayList<>();
            pessoas.add(new Pessoa2("João", 25));
            pessoas.add(new Pessoa2("Maria", 16));
            pessoas.add(new Pessoa2("Pedro", 30));
            pessoas.add(new Pessoa2("Ana", 20));
            pessoas.add(new Pessoa2("José", 18));

            List<String> nomesPessoasMaior18 = pessoas.stream()
                    .filter(pessoa -> pessoa.getIdade() > 18)
                    .map(Pessoa2::getNome)
                    .limit(3)
                    .collect(Collectors.toList());

            System.out.println(nomesPessoasMaior18);
        }



    static class Pessoa2 {
        private String nome;
        private Integer idade;

        public Pessoa2(String nome, Integer idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public Integer getIdade() {
            return idade;
        }
    }
}
