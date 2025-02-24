import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        File file = new File("C:/Users/example.txt");

        if (file.exists()) {
            long bytes = file.length();
            System.out.println("Size in Bytes: " + bytes);
            System.out.println("Size in KB: " + (bytes / 1024.0));
            System.out.println("Size in MB: " + (bytes / (1024.0 * 1024)));
        } else {
            System.out.println("File does not exist.");
        }
    }
}
