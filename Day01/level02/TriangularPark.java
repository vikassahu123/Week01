import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first side of the triangular park (in meters): ");
        double side1 = s.nextDouble();

        System.out.print("Enter the second side of the triangular park (in meters): ");
        double side2 = s.nextDouble();

        System.out.print("Enter the third side of the triangular park (in meters): ");
        double side3 = s.nextDouble();

        
        double perimeter = side1 + side2 + side3;

       
        double totalDistance = 5000;  // 5 km in meters

        //  number of rounds
        double rounds = totalDistance / perimeter;

        // Print the result
		// imp-- ceil used for the closed large value 
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");
    }
}
