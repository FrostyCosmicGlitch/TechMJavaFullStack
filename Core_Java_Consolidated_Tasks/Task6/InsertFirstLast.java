import java.util.LinkedList;

public class InsertFirstLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Start");
        list.addLast("End");

        System.out.println("Updated List: " + list);
    }
}
