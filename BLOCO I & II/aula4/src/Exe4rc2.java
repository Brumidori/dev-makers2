import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class Exe4rc2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] vetor = new int[100];
        int contador = 0;
        int contador2 = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = scanner.nextInt();
            contador++;
            if ( vetor[i] == 0 ) {
                break;
            }
        }

        int [] vetorInverso = new int[contador];

        for (int i = contador -1; i >= 0; i--) {
            vetorInverso[i] = vetor[(contador2)];
            contador2++;
        }
        System.out.println(Arrays.toString(vetorInverso));
    }
}
