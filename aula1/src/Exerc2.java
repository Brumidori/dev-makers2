import java.util.Scanner;

public class Exerc2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Escreva seu endereço:");
        String endereco = scanner.nextLine();

        System.out.println("Escreva seu telefone:");
        String telefone = scanner.nextLine();

        System.out.println("Escreva seu cidade:");
        String cidade = scanner.nextLine();

        System.out.println("Escreva seu cep:");
        String cep = scanner.nextLine();

        System.out.println("Dados: " + "\nnome: " + nome + "\nendereço: " +endereco + "\ntelefone: " +telefone + "\ncidade: " + cidade + "\ncep: " + cep);
    }
}
