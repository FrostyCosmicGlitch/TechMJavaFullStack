import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(List.of("Red", "Blue", "Green", "Yellow"));
        System.out.println(colors.contains("Green") ? "Element found" : "Element not found");
    }
}
