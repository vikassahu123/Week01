import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       
        System.out.print("Enter the salary: ");
        double salary = s.nextDouble();
        
        
        System.out.print("Enter the bonus: ");
        double bonus = s.nextDouble();
        
        // Calculate total income
        double totalIncome = salary + bonus;
        
        // Display the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence, Total Income is INR " + totalIncome);
    }
}
