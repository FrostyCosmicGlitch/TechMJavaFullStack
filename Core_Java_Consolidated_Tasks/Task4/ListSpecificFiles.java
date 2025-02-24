import java.io.File;
import java.io.FilenameFilter;

public class ListSpecificFiles {
    public static void main(String[] args) {
        File dir = new File("C:/Users/"); 

        FilenameFilter filter = (f, name) -> name.endsWith(".txt"); 

        String[] files = dir.list(filter);
        if (files != null && files.length > 0) {
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("No files found with the specified extension.");
        }
    }
}
