import java.util.Scanner;

public class Main {
    public static String capitalizeAlternate(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.append((i % 2 == 0) ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Formatted String: " + capitalizeAlternate(input));
    }
}
