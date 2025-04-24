import java.util.Arrays;
import java.util.List;

public class LambdaSum {
    public static void main(String[] args) {
        List<Integer> numere = Arrays.asList(1, 2, 3, 4, 5);

        int suma = numere.stream()
                         .mapToInt(n -> n)  // sau direct .mapToInt(Integer::intValue)
                         .sum();

        System.out.println("Suma: " + suma);
    }
}
