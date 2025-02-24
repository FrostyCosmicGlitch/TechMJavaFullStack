import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry", "mango", "apricot");

        List<String> sortedAsc = words.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> sortedDesc = words.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        System.out.println("Ascending Order: " + sortedAsc);
        System.out.println("Descending Order: " + sortedDesc);
    }
}
