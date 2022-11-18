import java.util.Scanner;

public class Tarefa1 {

    public static void main(String[] args) {
        double a;
        double b;
        String c;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        a = input.nextDouble();

        System.out.println("Insira o segundo número: ");
        b = input.nextDouble();

        System.out.println("Qual operação você gostaria de realizar? Digite o operador ( + - / *) ");
        c = input.next();

        if( c.equals("+") ) {
            System.out.println("A soma dos números é: " + (a + b));
        } else if (c.equals("-")) {
            System.out.println("A subtração dos números é: " + (a - b));
        } else if (c.equals("/")) {
            System.out.println("A divisão dos números é: " + (a / b));
        } else if (c.equals("*")) {
            System.out.println("A multiplicacao dos números é: " + (a * b));
        } else {
            System.out.println("Operação inválida");
        }
    }
}
