import java.util.Scanner;

public class StringIndexExceptionDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter the string ");
        String str = s.next();

        // to generate exception
        generateException(str);

        // to handle exception
        handleException(str);

       
    }

    // generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        System.out.println("\nGenerating exception...");
        int index = str.length(); // Index out of bounds (equal to string length)
        System.out.println("Accessing character at index " + index + ": " + str.charAt(index));
    }

    // handle StringIndexOutOfBoundsException
    public static void handleException(String str) {
        System.out.println("\nHandling exception...");
        int index = str.length(); // Index out of bounds
        try {
            System.out.println("Accessing character at index " + index + ": " + str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Invalid index! Please ensure the index is within the string length.");
        }
    }
}
