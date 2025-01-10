import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("enter the age ");
        int age = s.nextInt();

        // Check the condition of voting
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
