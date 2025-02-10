import java.util.*;
public class Anagram {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        int[] pFreq = new int[26];
        int[] sFreq = new int[26];
        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }
        int windowSize = p.length();
        for (int i = 0; i < windowSize; i++) {
            sFreq[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pFreq, sFreq)) {
            result.add(0);
        }
        for (int i = windowSize; i < s.length(); i++) {
            sFreq[s.charAt(i) - 'a']++;
            sFreq[s.charAt(i - windowSize) - 'a']--;
            
            if (Arrays.equals(pFreq, sFreq)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = findAnagrams(s, p);
        System.out.println("Anagram indices: " + result);
    }
}
