import java.util.Scanner;

class ExceptionHandling{
    public static void processInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            double number = Double.parseDouble(scanner.nextLine()); // Read input and parse as double

            if (number == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }

            double reciprocal = 1 / number;
            System.out.println("Reciprocal: " + reciprocal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        processInput();
    }
}
