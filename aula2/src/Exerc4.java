import java.util.Scanner;

public class Exerc4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        System.out.println(scanner.nextInt() % 2 == 0 ? "Par" :  "impar");


    }
}
