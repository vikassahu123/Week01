import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter the text ");
        String text = s.nextLine();

        // Find vowels and consonants
        int[] counts = countVowelsAndConsonants(text);

        // Display the results
        System.out.println("\nVowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        s.close();
    }

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharType(char c) {
        c = Character.toLowerCase(c); // Convert to lowercase
        if (c >= 'a' && c <= 'z') {  // Check if it's a letter
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String type = checkCharType(c);

            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants}; 
    }
}
