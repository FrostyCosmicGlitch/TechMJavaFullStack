import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("A", "B"));
        list.addLast("C");

        System.out.println("Updated List: " + list);
    }
}
