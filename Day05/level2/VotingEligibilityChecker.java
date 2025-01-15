import java.util.Random;

public class VotingEligibilityChecker {

    // Method to generate random ages for n students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) - 10; // Random ages between -10 and 80
        }
        return ages;
    }

    // Method to check voting eligibility and return a 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); // Age
            if (ages[i] < 0) {
                result[i][1] = "Invalid";
            } else if (ages[i] >= 18) {
                result[i][1] = "True"; // Can vote
            } else {
                result[i][1] = "False"; // Cannot vote
            }
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] data) {
        System.out.printf("%-10s %-15s%n", "Age", "Can Vote");
        System.out.println("---------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 10;
        
        // Generate random ages
        int[] ages = generateAges(numStudents);
        
        // Check voting eligibility
        String[][] eligibilityResults = checkVotingEligibility(ages);
        
        // Display the results
        displayResults(eligibilityResults);
    }
}
