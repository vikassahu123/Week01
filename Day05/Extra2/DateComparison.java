import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // first date input
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = scanner.nextLine();

        //  second date input
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = scanner.nextLine();

        // Parse the input strings to LocalDate objects
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

        // Compare the two dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date (" + firstDate + ") is before the second date (" + secondDate + ").");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date (" + firstDate + ") is after the second date (" + secondDate + ").");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date (" + firstDate + ") is the same as the second date (" + secondDate + ").");
        } else {
            System.out.println("An unexpected condition occurred.");
        }

     
    }
}
