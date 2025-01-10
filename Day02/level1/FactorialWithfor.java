import java.util.Scanner;

public class FactorialWithfor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("enter a positive integer ");
        int n = s.nextInt();

        //  if entered number is positive
        if (n >= 0) {
            int factorial = 1; // Variable to store the factorial
           

            // Compute the factorial using a for loop
           for(int i=1;i<=n;i++) {
                factorial *= i;
               
            }

            // Print output
            System.out.println("The factorial of " + n + " is " + factorial);
        } else {
            System.out.println("The number " + n + " is not a positive integer.");
        }
    }
}