import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");
        System.out.println("Tell me if my guess is 'high', 'low', or 'correct'.");

        
        int lowerBound = 1;
        int upperBound = 100;
        boolean guessedCorrectly = false;

        // Game loop
        while (!guessedCorrectly) {
            // Generate a random guess within the current range
            int guess = lowerBound + (int) (Math.random() * (upperBound - lowerBound + 1));
            System.out.println("Is your number " + guess + "?");

            // User feedback
            System.out.print("Enter your response (high/low/correct): ");
            String feedback = scanner.nextLine().toLowerCase();

            // Process the feedback
            if (feedback.equals("correct")) {
                guessedCorrectly = true;
                System.out.println("Hooray! I guessed your number: " + guess);
            } else if (feedback.equals("low")) {
                lowerBound = guess + 1; // Move the lower bound up
            } else if (feedback.equals("high")) {
                upperBound = guess - 1; // Move the upper bound down
            } else {
                System.out.println("Please respond with 'high', 'low', or 'correct'.");
            }

            // Check if bounds are valid
            if (lowerBound > upperBound) {
                System.out.println("Hmm, something went wrong. Did you follow the rules?");
                break;
            }
        }

        
    }
}
