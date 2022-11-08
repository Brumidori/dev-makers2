import java.util.Scanner;

public class MinhaClasse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade = 0;

        System.out.println("Escreva seu nome:");
        nome = scanner.nextLine();
        System.out.println("Digite a sua idade:" );
        idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Olá " + nome + "! Você pode dirigir" );
        } else {
            System.out.println("Olá " + nome + "! Você ainda não pode dirigir" );
        }



    }
}
