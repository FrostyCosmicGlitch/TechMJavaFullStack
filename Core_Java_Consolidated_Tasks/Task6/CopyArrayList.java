import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<String> original = new ArrayList<>(List.of("Red", "Blue", "Green"));
        ArrayList<String> copied = new ArrayList<>(original);

        System.out.println("Copied List: " + copied);
    }
}
