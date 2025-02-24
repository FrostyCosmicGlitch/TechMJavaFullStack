import java.io.File;

public class CheckExistence {
    public static void main(String[] args) {
        File file = new File("C:/Users/example.txt"); 

        if (file.exists()) {
            System.out.println("File/Directory exists.");
        } else {
            System.out.println("File/Directory does not exist.");
        }
    }
}
