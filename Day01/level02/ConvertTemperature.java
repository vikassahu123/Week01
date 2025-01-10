import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = s.nextDouble();
        
        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        
        // Display the result
        System.out.println("The" celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
