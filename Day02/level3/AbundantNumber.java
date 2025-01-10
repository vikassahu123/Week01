import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  
        System.out.print("Enter a number");  
        int num = s.nextInt();                  
        int sum = 0;
        
        for (int i = 1; i < num; i++) {         
            if (num % i == 0) {                
                sum += i;                      // Add the divisor to sum
            }
        }
        
        if (sum > num) {                       
            System.out.println(num + " is an Abundant Number");
        } else {
            System.out.println(num + " is not an Abundant Number");
        }
        
      
    }
}
