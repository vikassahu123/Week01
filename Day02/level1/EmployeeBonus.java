import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Enter the salary of the employee ");
        double salary = s.nextDouble();

        
        System.out.print("Enter the years of service: ");
        int yearsOfService = s.nextInt();

        // Check if the years of service are more than 5 years
        if (yearsOfService > 5) {
            // Calculate the bonus (5% of salary)
            double bonus = salary * 0.05; //directly use decimal value of 5 % for better 

            // Print the bonus amount
            System.out.println("The bonus amount for " + yearsOfService + " years of service is  " + bonus);
        } else {
            
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}
