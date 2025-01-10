import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("enter a number");  
        int number = s.nextInt();             
        int original = number;
        int sum = 0;
        
        while (number != 0) {                 
            sum += number % 10;                // Add the last digit
            number /= 10;                      // Remove the last digit
        }
        
        if (original % sum == 0) {             // Check if the original number is divisible by the sum of digits
            System.out.println(original + " is a Harshad Number");
        } else {
            System.out.println(original + " is not a Harshad Number");
        }
        
      
    }
}
