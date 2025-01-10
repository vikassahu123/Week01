import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = s.nextInt();
        int greatestFactor = 1;

        // Loop to find the greatest factor
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Output the greatest factor
        System.out.println("The greatest factor is " + greatestFactor);
    }
}
