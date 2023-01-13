import java.util.Scanner;

public class VetorEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um elemento: ");
        int k = sc.nextInt();
        boolean encontrado = false;

        int [] vetor = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < vetor.length; i++) {
            if( k == vetor[i] ){
            System.out.println("Elemento k na posicao: " + ++i );
            encontrado = true;
            break;
            }
        }

        if(!encontrado ){
            System.out.println("Elemento não encontrado");
        }
    }
}
