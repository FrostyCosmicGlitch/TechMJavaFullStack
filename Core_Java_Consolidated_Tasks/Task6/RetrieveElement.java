import java.util.ArrayList;

public class RetrieveElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(List.of("Red", "Blue", "Green", "Yellow"));
        System.out.println("Element at index 2: " + colors.get(2));
    }
}
