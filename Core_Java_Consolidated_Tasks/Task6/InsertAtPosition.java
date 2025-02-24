import java.util.LinkedList;

public class InsertAtPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("A", "C", "D"));
        list.add(1, "B");

        System.out.println("Updated List: " + list);
    }
}
