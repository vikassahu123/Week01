import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        int number1 = s.nextInt();

        
        System.out.print("Enter the second number: ");
        int number2 = s.nextInt();

        // Calculate the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Print the result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder +
                           " of two numbers " + number1 + " and " + number2);
    }
}
