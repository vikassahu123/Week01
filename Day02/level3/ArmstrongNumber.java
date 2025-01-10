import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  
        System.out.print("Enter a number ");  
        int number = s.nextInt();             
        int num = number;
        int sum = 0;
        
        while (num != 0) {
            int remainder = num % 10;           // Extract the last digit
            sum += remainder * remainder * remainder;  // Cube the digit and add to sum
            num /= 10;                           // Remove the last digit
        }
        
        if (sum == number) {
            System.out.println(number + " is an Armstrong number");  
        } else {
            System.out.println(number + " is not an Armstrong number"); 
        }
        
       
    }
}
