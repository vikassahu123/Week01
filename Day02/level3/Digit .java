import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter a number"); 
        int number = s.nextInt();              
        int count = 0;
        
        while (number != 0) {                   // Loop until the number becomes 0
            number /= 10;                       // Remove the last digit
            count++;                            // Increment the digit count
        } 
		
        // Output the count
        System.out.println("The number of digits is " + count);  
        
       
    }
}
