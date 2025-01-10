import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = s.nextInt();

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("The year " + year + " is a Leap Year");
        } else {
            System.out.println("The year " + year + " is not a Leap Year");
        }
    }
}
