import javax.swing.text.DateFormatter;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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

        LocalDate dataAgora = LocalDate.now();
        LocalTime horaAgora = LocalTime.now();
        LocalDateTime dataHoraAgora = LocalDateTime.now();

        System.out.println("Data " + dataAgora);
        System.out.println("Hora " + horaAgora);
        System.out.println("DataHora " + dataHoraAgora);

        LocalDate amanha = dataAgora.plusDays(1);
        System.out.println(amanha);

        ///dado uma data e hora especifica em string, use a api de data do Java para criar um objeto LocalDate,
        // LocalTime e LocalDateTime e imprimi-los

        String dataHoraString = "2023-02-28T10:30:00";
        String data = "2023-02-28";
        String hora1 = "22:10";

        LocalDate dataFormatada = LocalDate.parse(data);
        LocalTime hora = LocalTime.parse(hora1);
        LocalDateTime dataHora = LocalDateTime.parse(dataHoraString);

        System.out.println("Data: " + dataFormatada);
        System.out.println("Hora: " + hora);
        System.out.println("Data e Hora: " + dataHora);


        //a partir da data atual, calcule e imprima uma compra de R$ 64.000,00 parcelado em 48x.
        // Imprima o valor e a data de cada parcela

        double valorCompra = 64000.0;
        int numParcelas = 48;
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        double valorParcela = valorCompra / numParcelas;

        System.out.println("Compra de R$" + valorCompra + " parcelada em " + numParcelas + "x");

        for (int i = 1; i <= numParcelas; i++) {
            DecimalFormat df = new DecimalFormat("#.##");

            LocalDate dataParcela = dataAtual.plusMonths(i);
            String dataParcelaFormatada = dataParcela.format(formatter);
            System.out.println("Parcela " + i + ": R$" + df.format(valorParcela) + " em " + dataParcelaFormatada);
        }

    }
}
