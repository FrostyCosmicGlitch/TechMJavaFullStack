import java.util.ArrayList;

public class IterateArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(List.of("Red", "Blue", "Green", "Yellow"));

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
