import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Enter a number ");
        int number = s.nextInt();

        
        int[] multiplicationResult = new int[4]; // 6 to 9 inclusive, total 4 numbers

        
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

       
        System.out.println("Multiplication table for " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

       
    }
}
