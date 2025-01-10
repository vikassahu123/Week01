import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner s = new Scanner(System.in);

        // Take user input for two floating-point numbers
        System.out.print("Enter the first number: ");
        double number1 = s.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = s.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Print the results
        System.out.println(
            "The addition, subtraction, multiplication and division value of 2 numbers " 
            + number1 + " and " + number2 + " is " 
            + addition + ", " + subtraction + ", " + multiplication + ", and " + division
        );
    }
}