import java.io.File;
import java.util.Date;

public class LastModifiedDate {
    public static void main(String[] args) {
        File file = new File("C:/Users/proj/example.txt"); 

        if (file.exists()) {
            System.out.println("Last Modified Date: " + new Date(file.lastModified()));
        } else {
            System.out.println("File does not exist.");
        }
    }
}
