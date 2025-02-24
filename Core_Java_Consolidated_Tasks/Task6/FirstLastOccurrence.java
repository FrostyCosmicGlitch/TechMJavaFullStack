import java.util.LinkedList;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C", "A", "D"));

        System.out.println("First occurrence of A: " + list.indexOf("A"));
        System.out.println("Last occurrence of A: " + list.lastIndexOf("A"));
    }
}
