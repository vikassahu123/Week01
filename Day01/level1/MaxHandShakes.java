import java.util.Scanner;

public class MaxHandShakes {
    public static void main(String[] args) {
        // Input number of students
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = s.nextInt();

        // Calculate maximum handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Print the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + 
                           " students is: " + maxHandshakes);
    }
}