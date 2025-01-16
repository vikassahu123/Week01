import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        //  input 
        String input = getInput("Enter a string to check if it's a palindrome: ");
        
        //  if the string is a palindrome
        boolean isPalindrome = checkPalindrome(input);
        
        // Display the result
        displayResult(isPalindrome);
    }

  
    private static String getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

   
    private static boolean checkPalindrome(String str) {
        // Remove any spaces and convert to lowercase for uniform comparison
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        
        
        for (int i = 0; i < length / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(length - 1 - i)) {
                return false; // If any mismatch is found, it's not a palindrome
            }
        }
        return true; 
    }

    
    private static void displayResult(boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }
    }
}
