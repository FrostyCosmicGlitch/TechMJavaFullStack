import java.util.List;

public class GenericIndexFinder {
    public static <T> int findFirstIndex(List<T> list, T target) {
        return list.indexOf(target);
    }

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "Bob");
        System.out.println(findFirstIndex(names, "Bob")); 
        System.out.println(findFirstIndex(names, "David"));
    }
}
