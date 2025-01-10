import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        double principal = s.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = s.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = s.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result
        System.out.println("The Simple Interest is " + simpleInterest +
                           " for Principal " + principal +
                           ", Rate of Interest " + rate +
                           " and Time " + time);
    }
}
