import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[5];

        
        System.out.println("Enter 5 numbers ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = s.nextInt();
        }

        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print("The number " + numbers[i] + " is positive and ");
                if (numbers[i] % 2 == 0) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("The number " + numbers[i] + " is negative.");
            } else {
                System.out.println("The number " + numbers[i] + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

       
        if (first == last) {
            System.out.println("The first element is equal to the last element.");
        } else if (first > last) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        
    }
}
