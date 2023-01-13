import java.util.Scanner;

public class ExemploException  {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        try {
            LerEntrada();
        } catch (JogoDaVelhaException e) {
            System.out.println(e.getMessage());
        } catch (ZeroException e) {
            System.out.println(e.getMessage());
        }



        int[] vetor = new int[10];
        String s = null;
        try {
            s.toUpperCase();
            vetor[11] = 5;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        } finally {
            System.out.println("finally sempre executa");

        }
    }

    static void LerEntrada() throws JogoDaVelhaException, ZeroException{
        System.out.println("Digite um texto: ");
        String s = scanner.next();

        if(s.equals("#")){
            throw new JogoDaVelhaException();
        } if(s.equals("0")){
            throw new ZeroException();
        }
    }
}
