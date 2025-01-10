import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner s = new Scanner(System.in);

        // Ask the user to enter the height in centimeters
        int heightInCm=sc.nextInt();
	
	    double heightInInch = (heightInCm*1.0)/2.54;
	    double heightInFoot = (heightInInch/12);


        // Print the result
        System.out.println("Your Height in cm is"+ heightInCm + "while in feet is" + heightInFoot + "and inches is" + heightInInch);
    }
}