import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
       
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");

       
        int maxNumber = findMax(num1, num2, num3);

        
        System.out.println("The maximum of the three numbers is: " + maxNumber);
    }

    
    private static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Function to find the maximum of three numbers
    private static int findMax(int a, int b, int c) {
        int max = a; // Assume the first number is the largest
        if (b > max) {
            max = b; // Update max if the second number is larger
        }
        if (c > max) {
            max = c; // Update max if the third number is larger
        }
        return max;
    }
}
