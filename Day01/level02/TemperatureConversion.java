import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = s.nextDouble();
        
        // Conversion formula: Celsius = (Fahrenheit − 32) x 5/9
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        
        // Output the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
    }
}
