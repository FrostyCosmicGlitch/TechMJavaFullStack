import java.util.LinkedList;

public class InsertAtFront {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("B", "C"));
        list.addFirst("A");

        System.out.println("Updated List: " + list);
    }
}
