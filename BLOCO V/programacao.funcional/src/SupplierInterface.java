import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierInterface {

    public static LocalDate getDataAtual() {
        Supplier<LocalDate> dataSupplier = () -> LocalDate.now();
        return dataSupplier.get();
    }

    public static void main(String[] args) {
        LocalDate dataAtual = getDataAtual();
        System.out.println("A data atual é: " + dataAtual);
    }
}
