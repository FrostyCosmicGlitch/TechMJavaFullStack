import java.io.*;
import java.util.Scanner;

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

public class PositiveNumberCheck {
    public static void checkNumbersInFile(String filename) throws FileNotFoundException, PositiveNumberException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num > 0) {
                scanner.close();
                throw new PositiveNumberException("Positive number found: " + num);
            }
        }
        scanner.close();
        System.out.println("No positive numbers found.");
    }

    public static void main(String[] args) {
        try {
            checkNumbersInFile("numbers.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: File not found");
        } catch (PositiveNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
