import java.io.*;
public class FileNotFoundExample {
    public static void readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        FileReader fr = new FileReader(file); 
        System.out.println("File found and ready to read.");
    }
    public static void main(String[] args) {
        try {
            readFile("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: File not found - " + e.getMessage());
        }
    }
}
