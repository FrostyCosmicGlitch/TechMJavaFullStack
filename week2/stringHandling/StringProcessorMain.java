class StringProcessor {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static int countOccurrences(String text, String sub) {
        int count = 0, index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // Move index to search for next occurrence
        }
        return count;
    }
    public static String splitAndCapitalize(String str) {
        String[] words = str.split("\\s+"); // Split by spaces
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))) // Capitalize first letter
                      .append(word.substring(1)) // Append remaining part of word
                      .append(" ");
            }
        }
        return result.toString().trim(); // Remove trailing space
    }
}
public class StringProcessorMain {
    public static void main(String[] args) {
        String str = "hello world";
        String text = "banana apple banana banana orange banana";
        String sub = "banana";
        String sentence = "java is fun to learn";
        System.out.println("Reversed: " + StringProcessor.reverseString(str));
        System.out.println("Occurrences of 'banana': " + StringProcessor.countOccurrences(text, sub));
        System.out.println("Capitalized: " + StringProcessor.splitAndCapitalize(sentence));
    }
}
