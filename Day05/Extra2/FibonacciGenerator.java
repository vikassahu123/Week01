import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        // Take input from the user
        int terms = getInput("Enter the number of terms for the Fibonacci sequence: ");

        // Generate and print the Fibonacci sequence
        generateFibonacci(terms);
    }

    
    private static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    private static void generateFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Invalid input! Number of terms must be greater than 0.");
            return;
        }

       
        int a = 0, b = 1;
        System.out.println("Fibonacci Sequence:");

        
        System.out.print(a + " ");
        
        
        for (int i = 1; i < n; i++) {
            System.out.print(b + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
