import java.util.Scanner;

public class StringReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string to reverse: ");
        String text = scanner.nextLine();

        //  to reverse the input
        String reversedText = reverseString(text);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedText);
    }

    // Method to reverse a string
    public static String reverseString(String text) {
        char[] reversed = new char[text.length()];

        
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }

        // Convert the char array back to a string
        return new String(reversed);
    }
}
