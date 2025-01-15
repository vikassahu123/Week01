public class StudentScorecard {

    //  generate random scores
    public static int[][] generateScores(int n) {
        Random random = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {   //if assume minimun no. obtain
            scores[i][0] = random.nextInt(101); // Physics
            scores[i][1] = random.nextInt(101); // Chemistry
            scores[i][2] = random.nextInt(101); // Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateStatistics(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100) / 100.0; // Rounded to 2 decimals
            stats[i][2] = Math.round(percentage * 100) / 100.0;
        }
        return stats;
    }

    //  grades based on percentage
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70 && percentage <= 79 ) {
                grades[i] = "B";
            } else if (percentage >= 60  && percentage <= 69) {
                grades[i] = "C";
            } else if (percentage >= 50  && percentage <= 59) {
                grades[i] = "D";
            } else if (percentage >= 40  && percentage <= 49) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    //  display 
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", 
                "Physics", "Chemistry", "Math", "Total", "Average", "Percent", "Grade");
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s%n", 
                    scores[i][0], scores[i][1], scores[i][2], stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(10);
        double[][] stats = calculateStatistics(scores);
        String[] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
    }
}
