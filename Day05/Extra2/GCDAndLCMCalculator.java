import java.util.Scanner;

public class GCDAndLCMCalculator {
    public static void main(String[] args) {
       
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        
        // Calculate GCD
        int gcd = calculateGCD(num1, num2);
        
        // Calculate LCM using the GCD
        int lcm = calculateLCM(num1, num2, gcd);
        
        // Display the results
        displayResult(gcd, lcm);
    }

   
    private static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Function to calculate the GCD 
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //  calculate the LCM using the formula LCM(a, b) = (a * b) / GCD(a, b)
    private static int calculateLCM(int a, int b, int gcd) {
        return (a / gcd) * b;
    }

   
    private static void displayResult(int gcd, int lcm) {
        System.out.println("The GCD of the two numbers is: " + gcd);
        System.out.println("The LCM of the two numbers is: " + lcm);
    }
}
