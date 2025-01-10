import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        // Input weight in pounds
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = s.nextDouble();

        // Convert weight to kilograms
        double weightInKg = weightInPounds / 2.2;

        // Print the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + 
                           " and in kilograms is " + weightInKg);
    }
}