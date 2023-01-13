import java.util.ArrayList;
import java.util.Scanner;

public class Tarefa2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList();
        ArrayList<Double> precos = new ArrayList();

        System.out.println("Digite quantos produtos gostaria de cadastrar:");
        int quantidade = input.nextInt();

        while ( quantidade > 0) {
            System.out.println("Digite o nome e preço do produto:");
            String nome = input.next();
            nomes.add(nome);

            System.out.println("Digite o valor do produto:");
            double preco = input.nextDouble();
            precos.add(preco);

            quantidade--;
        }

        double maiorPreco = 0;
        double menorPreco = 99999999;
        int maior = 0;
        int menor = 0;

        for (int i = 0; i < precos.size(); i++) {
             if (maiorPreco < precos.get(i)){
                 maiorPreco = precos.get(i);
                 maior = i;
             }
             if (menorPreco > precos.get(i)){
                 menorPreco = precos.get(i);
                menor = i;
             }
        }

        System.out.println("O produto mais caro é: " + nomes.get(maior) + ", "+  maiorPreco);
        System.out.println("O o produto mais barato é :" + nomes.get(menor) + ", "+ menorPreco);
    }
}
