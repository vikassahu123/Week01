import java.util.Scanner;

public class CharacterTypeFinder {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') { // Convert uppercase to lowercase
            c += 32;
        }

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        } else if (c >= 'a' && c <= 'z') { // Check if it's a lowercase letter --> or any character.
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    // Method to classify characters in a string and store the results in a 2D array
    public static String[][] classifyCharacters(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharType(c);
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] data) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("----------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = s.nextLine();

        // Classify characters
        String[][] results = classifyCharacters(text);

        // Display results in tabular format
        displayResults(results);

        
    }
}
