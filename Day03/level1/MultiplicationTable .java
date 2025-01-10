import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Enter a number");
        int number = s.nextInt();


        int[] table = new int[10];

        // Generate the multiplication table
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1); // Calculate and store the result
        }

        
        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

    }
}
