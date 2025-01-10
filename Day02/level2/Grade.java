import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Enter marks for Physics ");
        int physics = s.nextInt();
        System.out.print("Enter marks for Chemistry ");
        int chemistry = s.nextInt();
        System.out.print("Enter marks for Maths ");
        int maths = s.nextInt();

        // Calculate total marks 
        int totalMarks = physics + chemistry + maths;
		
		
        double percentage = (totalMarks / 3.0);  // Calculate average

        System.out.println("Your Average Percentage is " + percentage + "%");

        
        if (percentage >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Level 4. above agency-normalized standards");
        } else if (percentage >= 70 && percentage<=79) {
            System.out.println("Grade: B");
            System.out.println("Remarks:Level 3, at agency-normalized standards");
        } else if (percentage >= 60 && percentage<=69) {
            System.out.println("Grade: C");
            System.out.println("Remarks:Level 2, below, but approaching agency-normalized standards");
        } else if (percentage >= 50 && percentage<=59) {
            System.out.println("Grade: D");
            System.out.println("Remarks:Level 1, well below agency-normalized standards");
		} else if (percentage >= 40 && percentage<=49) {
            System.out.println("Grade: E");
            System.out.println("Remarks:Level 1-, too below agency-normalized standards");
  		} else {
            System.out.println("Grade: F");
            System.out.println("Remarks: Remedial standards");
        }
    }
}
