public class Exerc2 {

    public static void main(String[] args) {

        double mes =0;
        double divida = 10000 ;
        double money = 1500 ;

        while (divida > money) {
            ++mes;
//             divida = 10000 + (10000 * 0.025); juros simples
//             money = 1500 + (1500 * 0.04 );
            divida = Math.pow((10000 * 1.025),mes ); //juros compostos
            money = Math.pow((1500 * 0.04), mes);
        }
        System.out.println("a quantidade de meses é " + mes);
    }
}
