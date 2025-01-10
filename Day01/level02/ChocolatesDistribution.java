import java.util.Scanner;

public class ChocolatesDistribution {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int chocolatesDistribution = s.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = s.nextInt();

        // Calculate chocolates each child gets remaining chocolates
        int eachChildGets = chocolatesDistribution / numberOfChildren; 
		
		// remaining chocolates
        int remainingChocolates = chocolatesDistribution % numberOfChildren;

        // Print the result
        System.out.println("The number of chocolates each child gets is " + eachChildGets +
                           " and the number of remaining chocolates are " + remainingChocolates);
    }
}
