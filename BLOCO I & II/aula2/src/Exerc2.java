import java.util.Scanner;

public class Exerc2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu cargo e salario:");
        String cargo = scanner.nextLine();
        double salario = scanner.nextInt();


        switch (cargo){
            case "tecnico":
                System.out.println("novo salário: " + (salario *=0.5) );
                break;
            case "gerente" :
                System.out.println("novo salário: " + (salario *=0.3) );
                break;
            default:
                System.out.println("novo salário: " + (salario *=0.2) );
        }
    }
}
