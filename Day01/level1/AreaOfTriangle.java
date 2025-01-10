import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner s = new Scanner(System.in);

        // Input base of the triangle 
        System.out.print("Enter the base in inches: ");
        double base = s.nextDouble();

        // Input height of the triangle 
        System.out.print("Enter the height in inches: ");
        double height = s.nextDouble();

        // Calculate area 
        double area = 0.5 * base * height; 
		
		System.out.println("The area of triangle is " +area); 
	} 
}