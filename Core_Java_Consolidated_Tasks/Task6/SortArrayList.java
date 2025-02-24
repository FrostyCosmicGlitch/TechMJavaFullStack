import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(List.of("Red", "Blue", "Green", "Yellow"));
        Collections.sort(colors);

        System.out.println("Sorted List: " + colors);
    }
}
