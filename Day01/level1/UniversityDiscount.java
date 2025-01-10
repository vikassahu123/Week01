import java.util.Scanner;

public class UniversityDiscount {  
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner s = new Scanner(System.in);

        // Ask the user to enter the fee
        System.out.print("Enter the fee: ");
        int fee = s.nextInt();

        // Ask the user to enter the discount percentage
        System.out.print("Enter the discount percentage: ");
        int discountPercent = s.nextInt();

        // Calculate the discount amount using the formula: discount = fee * discountPercent / 100
        double discount = fee * discountPercent / 100.0;

        // Calculate the final fee to be paid after applying the discount
        double finalFee = fee - discount;

        // Print the results
        System.out.println(
            "The discount amount is INR " + discount + 
            " and final discounted fee is INR " + finalFee
        );
    } 
}