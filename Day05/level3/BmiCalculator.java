


import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] heightWeightArray = new double[10][2];

        // Input height and weight
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            heightWeightArray[i][0] = sc.nextDouble();

            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            heightWeightArray[i][1] = sc.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiStatusArray = calculateBMIStatus(heightWeightArray);

        // Display the results
        displayResults(bmiStatusArray);
    }

    public static String[][] calculateBMIStatus(double[][] heightWeightArray) {
        String[][] bmiStatusArray = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = heightWeightArray[i][0];
            double height = heightWeightArray[i][1] / 100; // Convert cm to meters
            double bmi = weight / (height * height);

            bmiStatusArray[i][0] = String.format("%.2f", heightWeightArray[i][0]);
            bmiStatusArray[i][1] = String.format("%.2f", heightWeightArray[i][1]);
            bmiStatusArray[i][2] = String.format("%.2f", bmi);
            bmiStatusArray[i][3] = getStatus(bmi);
        }

        return bmiStatusArray;
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public static void displayResults(String[][] bmiStatusArray) {
        System.out.println("Person\tHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t\t" + bmiStatusArray[i][1] + "\t" + bmiStatusArray[i][0] + "\t" + bmiStatusArray[i][2] + "\t\t" + bmiStatusArray[i][3]);
        }
    }
}