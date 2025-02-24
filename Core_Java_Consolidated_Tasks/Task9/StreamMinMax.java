import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 5, 8, 3, 15, 20, 1);

        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);

        System.out.println("Minimum value: " + min.orElse(null));
        System.out.println("Maximum value: " + max.orElse(null));
    }
}
