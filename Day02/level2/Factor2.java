import java.util.Scanner;

public class Factor2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = s.nextInt();
        
        System.out.println("The factors of " + number + " are");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
