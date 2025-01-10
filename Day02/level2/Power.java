import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = s.nextInt();
        System.out.print("Enter the power: ");
        int power = s.nextInt();

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiplying the number by itself 'power' times
        }

        System.out.println("The result is " + result);  
    }
}
