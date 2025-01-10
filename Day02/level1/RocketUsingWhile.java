import java.util.Scanner;

public class RocketUsingWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("enter the countdown start value ");
        int counter = s.nextInt();

        // Countdown using a while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }

    }
}
