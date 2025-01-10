import java.util.Scanner;

public class FactorialWithWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("enter a positive integer ");
        int n = s.nextInt();

        //  if entered number is positive
        if (n >= 0) {
            int factorial = 1; // Variable to store the factorial
            int i = 1; // Counter variable 

            // Compute the factorial using a while loop
            while (i <= n) {
                factorial *= i;
                i++;
            }

            // Print output
            System.out.println("The factorial of " + n + " is " + factorial);
        } else {
            System.out.println("The number " + n + " is not a positive integer.");
        }
    }
}
