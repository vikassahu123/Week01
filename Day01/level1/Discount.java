public class Discount {  
    public static void main(String[] args) {
        // Original course fee
        int fee = 125000;  

        // Discount percentage offered by the university
        int discountPercent = 10;  

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