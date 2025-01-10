import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("enter the month ");
        int month = s.nextInt();
        System.out.print("enter the day ");
        int day = s.nextInt();

        // Check if it's a Spring Season
        if ((month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) ||
            (month == 6 && day >= 1 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
