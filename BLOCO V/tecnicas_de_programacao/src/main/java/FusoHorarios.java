import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class FusoHorarios {
    public static void main(String[] args) {


        LocalDate hoje = LocalDate.now();
        BigDecimal valor = new BigDecimal(64000.00 / 48).setScale(2, RoundingMode.HALF_EVEN);

        int i = 0;
        while (i < 48) {
            DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataParcelas = hoje.plusMonths(i);
            if (hoje.plusMonths(i).getDayOfWeek() == DayOfWeek.SATURDAY) {
                LocalDate dataParcelasSemana1 = hoje.plusMonths(i).plusDays(2);
                String dataFormatada = dataParcelasSemana1.format(padrao);
                System.out.println("Parcela: " + (i + 1) + " - " + dataFormatada + " - valor: R$ " + valor + " " + dataParcelasSemana1.getDayOfWeek());
                i++;
            } else if (hoje.plusMonths(i).getDayOfWeek() == DayOfWeek.SUNDAY) {
                LocalDate dataParcelasSemana2 = hoje.plusMonths(i).plusDays(1);
                String dataFormatada = dataParcelasSemana2.format(padrao);
                System.out.println("Parcela: " + (i + 1) + " - " + dataFormatada + " - valor: R$ " + valor + " " + dataParcelasSemana2.getDayOfWeek());
                i++;
            } else {
                String dataFormatada = dataParcelas.format(padrao);
                System.out.println("Parcela: " + (i + 1) + " - " + dataFormatada + " - valor: R$ " + valor + " " + dataParcelas.getDayOfWeek());
                i++;
            }
        }



        int i = 0;
        while (i < 48) {
            DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataParcelas = hoje.plusMonths(i);
            if(hoje.plusMonths(i).getDayOfWeek() == DayOfWeek.SATURDAY || hoje.plusMonths(i).getDayOfWeek() ==  DayOfWeek.SUNDAY){
                LocalDate dataParcelasSemana1 = hoje.plusMonths(i).with(TemporalAdjusters.next(DayOfWeek.MONDAY));
                String dataFormatada = dataParcelasSemana1.format(padrao);
                System.out.println("Parcela: " + (i + 1) + " - " + dataFormatada + " - valor: R$ " + valor + " " + dataParcelasSemana1.getDayOfWeek());
                i++;
            } else{
                String dataFormatada = dataParcelas.format(padrao);
                System.out.println("Parcela: " + (i + 1) + " - " + dataFormatada + " - valor: R$ " + valor + " " + dataParcelas.getDayOfWeek());
                i++;
            }}
    }
}
