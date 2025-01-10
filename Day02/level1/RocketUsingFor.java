import java.util.Scanner;

public class RocketUsingFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("enter the countdown start value ");
        int counter = s.nextInt();

        // Countdown using a for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

    }
}