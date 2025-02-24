import java.util.LinkedList;

public class InsertMultiple {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("A", "D"));
        list.addAll(1, List.of("B", "C"));

        System.out.println("Updated List: " + list);
    }
}
