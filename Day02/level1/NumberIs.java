import java.util.Scanner;

public class NumberIs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("enter a number ");
        int number = s.nextInt();

        // check all conditions
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}
