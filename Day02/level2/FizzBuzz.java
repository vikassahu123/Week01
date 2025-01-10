import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("enter a positive integer");
        int number = s.nextInt();

            for (int i = 0; i <= number; i++) {
                // Check for multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check for multiples of 3
                else if (i % 3 == 0 ) {
                    System.out.println("Fizz");
                }
                // Check for multiples of 5
                else if (i % 5 == 0 ) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println("the number is not a multiple of 3 or 5 as well as both 3 and 5 ");
                }
            }
        }
    }
}
