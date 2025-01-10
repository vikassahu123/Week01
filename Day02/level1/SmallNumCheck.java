import java.util.Scanner;

public class SmallNumCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Enter the first number ");
        int number1 = s.nextInt();

        System.out.print("Enter the second number ");
        int number2 = s.nextInt();

        System.out.print("Enter the third number ");
        int number3 = s.nextInt();

        // Check first number is the smallest or not
        boolean ans = (number1 < number2) && (number1 < number3);

       
        System.out.println("Is the first number the smallest? " + ans);
    }
}