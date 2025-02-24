import java.io.File;

public class CheckFileOrDir {
    public static void main(String[] args) {
        File file = new File("C:/Users/proj/example.txt"); 

        if (file.isDirectory()) {
            System.out.println("It's a directory.");
        } else if (file.isFile()) {
            System.out.println("It's a file.");
        } else {
            System.out.println("Path does not exist.");
        }
    }
}
