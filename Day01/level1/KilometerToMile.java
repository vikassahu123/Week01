import java.util.Scanner;

public class KilometerToMile {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner s = new Scanner(System.in);

        // Ask the user to enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double km = s.nextDouble();

        // Conversion factor: 1 mile = 1.6 kilometers
        double conversionFactor = 1.6;

        // Calculate miles
        double miles = km / conversionFactor;

        // Print the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}