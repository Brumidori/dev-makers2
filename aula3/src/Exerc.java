import java.util.Scanner;

public class Exerc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int number = scanner.nextInt();
        int divisor = 2;

        while (number % divisor != 0) {
            divisor++;
        }

        if (divisor == number) {
            System.out.println("The number is prime");
        } else if (number ==1){
            System.out.println("the number 1 is neutral");
        }
        else {
            System.out.println("The number is not prime");
        }

        System.out.println("o numero é primo: " + ehPrimo(number));
    }

    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}
