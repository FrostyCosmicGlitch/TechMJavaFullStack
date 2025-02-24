import java.util.LinkedList;

public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C"));

        for (String item : list) {
            System.out.println(item);
        }
    }
}
