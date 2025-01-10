import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner s = new Scanner(System.in);

        // Input unit price of the item
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = s.nextDouble();

        // Input quantity to be bought
        System.out.print("Enter the quantity to be bought: ");
        int quantity = s.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Print the total price
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}