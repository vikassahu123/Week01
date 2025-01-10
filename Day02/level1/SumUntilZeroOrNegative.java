import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // use total to store the sum
        double total = 0.0;

        //  loop to continuously until zero or negative number take user input
        while (true) {
            
            System.out.print("enter a number (0 or negative to stop) ");
            double userInput = s.nextDouble();

            // Check if the input is 0 or negative, break the loop
            if (userInput <= 0) {
                break;
            }

            // Add the user input to total
            total += userInput;
        }

        // Display the total sum
        System.out.println("The total sum is " + total);
    }
}
