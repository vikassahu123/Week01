import java.util.Scanner;

public class StoreValuesAndSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        double[] numbers = new double[10]; 
        double total = 0.0; 
        int index = 0; 

        System.out.println("Enter numbers (up to 10). Enter 0 or a negative number to stop:");

        
        while (true) {
            System.out.print("Enter a number: ");
            double input = s.nextDouble();

            // Check for stop condition
            if (input <= 0 || index == 10) {
                break;
            }

            // Store the value in the array and increment the index
            numbers[index] = input;
            index++;
        }

        // Calculate the total and display all numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Display the total sum
        System.out.println("\nTotal sum of numbers: " + total);

       
    }
}
