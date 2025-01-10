import java.util.Scanner;

public class FootballTeamHeight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       
        double[] heights = new double[11];
        double sum = 0.0;

        
        System.out.println("Enter the heights of 11 players (in cm) ");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + " is  ");
            heights[i] = s.nextDouble();
            sum += heights[i]; // Add the height to the sum
        }

        // Calculate the mean height
        double meanHeight = sum / heights.length;

        // Display the result
        System.out.println("The mean height of the football team is " + meanHeight + " cm");

       
    }
}
