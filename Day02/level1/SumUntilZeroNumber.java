import java.util.Scanner;

public class SumUntilZeroNumber { 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Initialize total variable
        double total = 0.0;

        //  to store user input
        double userInput;

      
        System.out.print("enter a number (0 to stop) ");
        userInput = s.nextDouble();

        
        while (userInput != 0) {
            total += userInput; // Add the user input to total

            
            System.out.print("enter a number (0 to stop) ");
            userInput = s.nextDouble();
        }

        // Display the total sum
        System.out.println("The total sum is " + total);
    }
}
