import java.util.Scanner;

public class MatrizQuadrada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la matriz quadrada");
        int tamanho = verifica();

        int[][] matriz = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {

            for (int j = 0; j < tamanho; j++) {
                if (i <= j) {
                    matriz[i][j] = 0;
                } else {
                   matriz[i][j] = 1;
                }
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }

    }

    public static int verifica() {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int tamanho = 0;

        try {
            tamanho = Integer.parseInt(input);
        } catch (NumberFormatException e){
            System.out.println("Digite apenas numeros inteiros");
            tamanho = verifica();
        }

        while (!(tamanho >= 2 && tamanho <= 20)){
            System.out.println("Digite apenas numeros entre 2 e 20");
            tamanho = verifica();
}

        return tamanho;
    }
}
