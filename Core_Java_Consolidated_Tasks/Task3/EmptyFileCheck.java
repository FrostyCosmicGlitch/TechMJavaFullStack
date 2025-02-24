import java.io.*;

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

public class EmptyFileCheck {
    public static void checkIfFileIsEmpty(String filename) throws FileNotFoundException, EmptyFileException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        if (br.readLine() == null) {
            br.close();
            throw new EmptyFileException("File is empty: " + filename);
        }
        br.close();
        System.out.println("File is not empty.");
    }

    public static void main(String[] args) {
        try {
            checkIfFileIsEmpty("emptyfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: File not found");
        } catch (EmptyFileException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
