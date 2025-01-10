import java.util.Scanner;

public class Youngest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the age of Amar ");
        int ageAmar = s.nextInt();
        System.out.print("Enter the height of Amar ");
        int heightAmar = s.nextInt();
        System.out.print("Enter the age of Akbar ");
        int ageAkbar = s.nextInt();
        System.out.print("Enter the height of Akbar ");
        int heightAkbar = s.nextInt();
        System.out.print("Enter the age of Anthony ");
        int ageAnthony = s.nextInt();
        System.out.print("Enter the height of Anthony ");
        int heightAnthony = s.nextInt();

        int youngestAge = ageAmar;
        String ans1 = "Amar";
        if (ageAkbar < youngestAge) { 
            youngestAge = ageAkbar; 
            ans1 = "Akbar";
        } 
        if (ageAnthony < youngestAge) {
            youngestAge = ageAnthony; 
            ans1 = "Anthony";
        }

        String ans2 = "Amar";
        int tallestHeight = heightAmar;
        if (heightAkbar > tallestHeight) { 
            tallestHeight = heightAkbar; 
            ans2 = "Akbar";
        }
        if (heightAnthony > tallestHeight) { 
            tallestHeight = heightAnthony; 
            ans2 = "Anthony";
        }

        System.out.println("The youngest friend is " + ans1);
        System.out.println("The tallest friend is " + ans2);
    }
}
