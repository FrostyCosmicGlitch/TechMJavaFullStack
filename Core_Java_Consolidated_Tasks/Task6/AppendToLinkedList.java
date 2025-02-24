import java.util.LinkedList;

public class AppendToLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C"));
        list.addLast("D");

        System.out.println("Updated LinkedList: " + list);
    }
}
