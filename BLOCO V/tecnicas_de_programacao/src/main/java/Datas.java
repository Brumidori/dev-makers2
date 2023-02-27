import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Datas {

    public static void main(String[] args) {
        Date agora = new Date();
        Long milisegundos = agora.getTime();
        int mes = agora.getMonth();

        System.out.println(milisegundos);
        System.out.println("Mes " + mes + "");

        Calendar cal = Calendar.getInstance();

        // a bibloteca de date e calendar sao depreciadas


    }
}
