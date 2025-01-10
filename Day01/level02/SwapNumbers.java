import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Enter the first number: ");
        int number1 = s.nextInt();
        
        
        System.out.print("Enter the second number: ");
        int number2 = s.nextInt();
        
        // Swapping logic
        int temp = number1;
        number1 = number2;
        number2 = temp;
        
        // Display the swapped result
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
