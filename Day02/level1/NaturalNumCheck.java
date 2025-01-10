import java.util.Scanner;

public class NaturalNumCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       
        System.out.print("enter a number ");
        int number = s.nextInt();

        // if number is a natural 
        if (number >= 0) {
            
            int sum = (number * (number + 1)) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}

