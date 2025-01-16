import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
       // input 
        int number = getInput("Enter a number to calculate its factorial: ");
        
        // Calculate the factorial using recursion
        long factorial = calculateFactorial(number);
        
        // Display the result
        displayResult(number, factorial);
    }

    private static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    
    private static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return num * calculateFactorial(num - 1); // Recursive call
    }

    //  display the result
    private static void displayResult(int num, long result) {
        System.out.println("The factorial of " + num + " is: " + result);
    }
}
