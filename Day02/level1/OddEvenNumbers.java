import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("enter a positive integer");
        int number = s.nextInt();

        // Check number is a natural number
        if (number > 0) {
            System.out.println("Odd and even numbers from 1 to " + number );

            // Iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the current number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
