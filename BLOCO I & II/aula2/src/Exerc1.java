import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor insira as cordenadas x e y:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        boolean A = x < 0 && y > 0;
        boolean B = x > 0 && y > 0;
        boolean C = x < 0 && y < 0;
        boolean D = x > 0 && y < 0;
        boolean E = x == 0 && y == 0;

        String eixo;

//        if (x > 0 && y > 0) {
//            System.out.println("O ponto está no quadrante B");
//        } else if (x>0 && y < 0 ){
//            System.out.println("O ponto está no quadrante C");
//        } else if (x < 0 && y < 0 ){
//            System.out.println("O ponto está no quadrante D");
//        } else if (x < 0 && y > 0 ){
//            System.out.println("O ponto está no quadrante A");
//        } else {
//            System.out.println("O ponto está no ponto 0,0");
//        }

        eixo = A ? "A" : B ? "B" : C ? "C" : D ? "D" : "E";

        System.out.println("O ponto está no quadrante " + eixo);
    }
}
