public class Predicate {

    public static boolean isPar(int numero) {
        java.util.function.Predicate<Integer> par = n -> n % 2 == 0;
        return par.test(numero);
    }

    public static void main(String[] args) {
        int numero = 10;
        if (isPar(numero)) {
            System.out.println(numero + " é par!");
        } else {
            System.out.println(numero + " não é par.");
        }
    }
}
