import java.util.ArrayList;
import java.util.List;

public class lambda {

    public static void main(String[] args) {
        var numeros = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

        numeros.removeIf(numero -> numero %2 != 0);
        
    }
}
