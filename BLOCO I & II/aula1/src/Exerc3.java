import java.util.Scanner;

public class Exerc3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá digite o primeiro numero:");
        int a = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        int b = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        int c = scanner.nextInt();



        if( a > b && a > c) {
            System.out.println("O maior numero é " + a);
        } else if(b > c) {
            System.out.println("O maior numero é " + b);
        } else if(c > a && c > b) {
            System.out.println("O maior numero é " + c);
        }

    }
}
