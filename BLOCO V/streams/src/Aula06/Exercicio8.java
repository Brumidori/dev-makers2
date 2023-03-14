package Aula06;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio8 {

    public class Aluno {
        String nome;
        Integer idade;
        Double nota;

        public Aluno(String nome, Integer idade, Double nota) {
            this.nome = nome;
            this.idade = idade;
            this.nota = nota;
        }

        public String getNome() {
            return nome;
        }

        public Integer getIdade() {
            return idade;
        }

        public Double getNota() {
            return nota;
        }

        public void main(String[] args) {
            List<Aluno> alunos = Arrays.asList(
                    new Aluno("João", 20, 7.5),
                    new Aluno("Maria", 20, 8.0),
                    new Aluno("Pedro", 21, 6.5),
                    new Aluno("Lucas", 21, 9.0),
                    new Aluno("Julia", 22, 5.5),
                    new Aluno("Ana", 22, 7.0)
            );

            Map<Integer, DoubleSummaryStatistics> estatisticasPorIdade =
                    alunos.stream()
                            .collect(Collectors.groupingBy(Aluno::getIdade,
                                    Collectors.summarizingDouble(Aluno::getNota)));

            System.out.println(estatisticasPorIdade);
        }
    }
}
