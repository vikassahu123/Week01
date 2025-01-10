import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Enter the value of a: ");
        double a = s.nextDouble();
        
        System.out.print("Enter the value of b: ");
        double b = s.nextDouble();
        
        System.out.print("Enter the value of c: ");
        double c = s.nextDouble();
        
        // Perform double operations
        double result1 = a + b * c;            
        double result2 = a * b + c;             
        double result3 = c + a / b;            
        double result4 = a % b + c;             
        
       
        System.out.println("The results of Double Operations are: "+result1+ ", "+ result2+ ", "+result3+ ","+result4);
        
    }
}
