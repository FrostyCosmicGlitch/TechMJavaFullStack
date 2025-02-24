import java.util.LinkedList;
import java.util.Collections;

public class ReverseIteration {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C"));
        Collections.reverse(list);

        for (String item : list) {
            System.out.println(item);
        }
    }
}
