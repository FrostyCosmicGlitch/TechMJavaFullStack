import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File dir = new File("C:/Users/projs/"); 

        if (dir.exists() && dir.isDirectory()) {
            String[] files = dir.list();
            System.out.println("Files and directories in " + dir.getPath() + ":");
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("Directory does not exist.");
        }
    }
}
