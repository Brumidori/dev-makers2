import java.util.Scanner;

public class Exerc3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o numero de linhas do triangulo:");
        int linhas = input.nextInt();

        for (int i = linhas; i > 0; i--) {
            for ( int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
