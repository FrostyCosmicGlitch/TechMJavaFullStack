import java.util.ArrayList;

public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(List.of("Red", "Blue", "Green", "Yellow"));
        colors.set(1, "Purple");

        System.out.println("Updated List: " + colors);
    }
}
