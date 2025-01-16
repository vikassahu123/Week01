import java.util.Scanner;

public class RemoveDuplicatesWithoutStringBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string to remove duplicates: ");
        String text = scanner.nextLine();

        // Call the method to remove duplicates
        String result = removeDuplicates(text);

        // Display the result
        System.out.println("String after removing duplicates: " + result);
    }

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String text) {
        String result = "";
        boolean[] seen = new boolean[256]; // Array to track seen characters (ASCII values)

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!seen[c]) { // Check if the character is not already seen
                result += c; // Append character to result
                seen[c] = true; // Mark the character as seen
            }
        }

        return result;
    }
}
