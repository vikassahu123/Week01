import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        double num1 = getInput("Enter the first number: ");
        double num2 = getInput("Enter the second number: ");
        
        switch (choice) {
            case 1:
                double additionResult = add(num1, num2);
                System.out.println("The result of addition is: " + additionResult);
                break;
            case 2:
                double subtractionResult = subtract(num1, num2);
                System.out.println("The result of subtraction is: " + subtractionResult);
                break;
            case 3:
                double multiplicationResult = multiply(num1, num2);
                System.out.println("The result of multiplication is: " + multiplicationResult);
                break;
            case 4:
                if (num2 != 0) {
                    double divisionResult = divide(num1, num2);
                    System.out.println("The result of division is: " + divisionResult);
                } else {
                    System.out.println("Division by zero is not allowed!");
                }
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

   
    }

    // Function to take input from the user
    private static double getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    // Function to perform addition
    private static double add(double a, double b) {
        return a + b;
    }

    // Function to perform subtraction
    private static double subtract(double a, double b) {
        return a - b;
    }

    // Function to perform multiplication
    private static double multiply(double a, double b) {
        return a * b;
    }

    // Function to perform division
    private static double divide(double a, double b) {
        return a / b;
    }
}
