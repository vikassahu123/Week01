
import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two texts from the user
        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine();

        // Check if the texts are anagrams and display the result
        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
    }

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert to lower case
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of the texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store the frequency of characters
        int[] charCount1 = new int[26];
        int[] charCount2 = new int[26];

        // Find the frequency of characters in the first text
        for (int i = 0; i < text1.length(); i++) {
            charCount1[text1.charAt(i) - 'a']++;
        }

        // Find the frequency of characters in the second text
        for (int i = 0; i < text2.length(); i++) {
            charCount2[text2.charAt(i) - 'a']++;
        }

        // Compare the frequency of characters in the two texts
        for (int i = 0; i < 26; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false;
            }
        }

        return true;
    }
}