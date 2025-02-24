import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileToByteArray {
    public static void main(String[] args) {
        File file = new File("C:/Users/proj/example.txt"); 

        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            System.out.println("File read into byte array successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
