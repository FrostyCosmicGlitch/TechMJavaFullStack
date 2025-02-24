import java.util.LinkedList;

public class IterateFromPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C", "D", "E"));

        for (int i = 2; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
