import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner s = new Scanner(System.in);

        // Input perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = s.nextDouble();

        // Calculate the side length of the square
        double side = perimeter / 4;

        // Print the results
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}