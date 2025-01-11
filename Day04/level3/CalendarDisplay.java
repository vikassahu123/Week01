import java.util.Scanner;

public class CalendarDisplay {
    
    // Array containing the names of the months
    private static final String[] monthNames = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };
    
    // Array containing the number of days in each month
    private static final int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };
    
    // Method to check if the given year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
    
    // Method to return the number of days in the given month
    public static int getNumberOfDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February has 29 days in a leap year
        }
        return daysInMonth[month - 1]; // Days in other months
    }
    
    // Method to return the name of the month
    public static String getMonthName(int month) {
        return monthNames[month - 1];
    }
    
    // Method to calculate the first day of the month using Zeller's Congruence Algorithm
    public static int getFirstDayOfMonth(int year, int month) {
        int q = 1;  // The day of the month
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int h = (q + ((13 * (month + 1)) / 5) + k + (k / 4) + (j / 4) - (2 * j)) % 7;
        return h; // Returns the day of the week (0=Saturday, 1=Sunday, ..., 6=Friday)
    }
    
    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("          " + getMonthName(month) + " " + year);
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");
        
        int daysInThisMonth = getNumberOfDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(year, month);  // Day of the week for the 1st day
        
        // Displaying spaces before the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("     ");
        }
        
        // Displaying the days of the month
        for (int day = 1; day <= daysInThisMonth; day++) {
            System.out.printf("%3d   ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // Newline after the last day of the month
    }
    
    // Main method to take user input and display the calendar
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        displayCalendar(month, year);
    }
}
