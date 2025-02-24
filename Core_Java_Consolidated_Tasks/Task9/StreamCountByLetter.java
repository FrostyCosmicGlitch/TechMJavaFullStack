import java.util.Arrays;
import java.util.List;

public class StreamCountByLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "blueberry", "avocado");

        char startLetter = 'a';

        long count = words.stream()
                .filter(word -> word.startsWith(String.valueOf(startLetter)))
                .count();

        System.out.println("Number of words starting with '" + startLetter + "': " + count);
    }
}
