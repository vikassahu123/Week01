import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // the format yyyy-MM-dd
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Add 7 days, 1 month, and 2 years to the input date
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks from the updated date
        LocalDate finalDate = updatedDate.minusWeeks(3);

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("After adding 7 days, 1 month, and 2 years: " + updatedDate.format(formatter));
        System.out.println("After subtracting 3 weeks: " + finalDate.format(formatter));

       
    }
}
