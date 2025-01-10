import java.util.Scanner;

public class NaturalNumSumUsingFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // the user to enter a number
        System.out.print("enter a natural number");
        int n = s.nextInt();

        //  if the number is a natural number
        if (n > 0) {
            //  sum using the formula
            int sumByFormula = (n * (n + 1)) / 2;

            //  sum using a while loop
            int sumByLoop = 0;
            for(int i=1;i<=n;i++) 
			{
			  sumByLoop+=i; 
			  }

            // Display the results
            System.out.println("The sum of " + n + " natural numbers using the formula is " + sumByFormula);
            System.out.println("The sum of " + n + " natural numbers using the while loop is " + sumByLoop);

            // Verify the results
            if (sumByFormula == sumByLoop) {
                System.out.println("Both computations are correct");
            } else {
                System.out.println("There is an error in the computation");
            }
        }
		else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}