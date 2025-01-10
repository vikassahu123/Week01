import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
		
        System.out.print("Enter the first number"); 
        double first = s.nextDouble(); 
		
        System.out.print("Enter the second number"); 
        double second = s.nextDouble(); 
		
        System.out.print("Enter an operator (+, -, *, /) ");  
        String op = s.next();                         

        switch (op) {                                 // Using switch statement to perform operations
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {  // To avoid division by zero
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
        }

      
    }
}
