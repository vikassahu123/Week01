import java.util.Random;

public class EmployeeBonus {

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10); 
        double[][] updatedData = calculateNewSalariesAndBonuses(employeeData); // Calculate bonuses and new salaries
        displaySummary(employeeData, updatedData); 
    }

    public static int[][] generateEmployeeData(int numberOfEmployees) {
        Random random = new Random();
        int[][] data = new int[numberOfEmployees][2];

        for (int i = 0; i < numberOfEmployees; i++) {
            data[i][0] = 20000 + random.nextInt(80001);
            data[i][1] = random.nextInt(11); 
        }

        return data;
    }

    public static double[][] calculateNewSalariesAndBonuses(int[][] employeeData) {
        double[][] result = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02; // Bonus logic
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
        }

        return result;
    }

    public static void displaySummary(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("ID    Old Salary  Years   Bonus      New Salary  Service");
        for (int i = 0; i < oldData.length; i++) {
            int oldSalary = oldData[i][0];
            int yearsOfService = oldData[i][1];
            double bonus = newData[i][0];
            double newSalary = newData[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.println(
                    (i + 1) + "     " + oldSalary + "      " + yearsOfService + "     " +
                            String.format("%.2f", bonus) + "     " +
                            String.format("%.2f", newSalary) + "     " + yearsOfService
            );
        }

        System.out.println("\nSummary:");
        System.out.println("Total Old Salary: " + String.format("%.2f", totalOldSalary));
        System.out.println("Total Bonus: " + String.format("%.2f", totalBonus));
        System.out.println("Total New Salary: " + String.format("%.2f", totalNewSalary));
    }
}
