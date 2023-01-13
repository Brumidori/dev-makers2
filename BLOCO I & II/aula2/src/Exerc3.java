import java.util.Scanner;

public class Exerc3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário:");
        double salario = scanner.nextDouble();

        double ferias = (salario/3);

        double inss = salario * 0.075;

        double inssT = inss*13;

        double salarioTotal =  salario*13 + ferias;

        double anual = salarioTotal - inssT;

        System.out.printf( "salário total: %.2f e salário liquido:%.2f", salarioTotal, anual);

    }
}
