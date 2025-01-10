import java.util.Scanner;

public class LargeNumCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       
        System.out.print("Enter the first number ");
        int number1 = s.nextInt();

        System.out.print("Enter the second number ");
        int number2 = s.nextInt();

        System.out.print("Enter the third number ");
        int number3 = s.nextInt();

        
        boolean isFirstLargest =false; 
        if((number1 > number2) && (number1 > number3)) 
		{ isFirstLargest=true;
		}
		
        boolean isSecondLargest =false; 
        if((number2 > number1) && (number2 > number3)) 
		{ isSecondLargest=true;
		}
		
        boolean isThirdLargest = false; 
		if((number3 > number1) && (number3 > number2))
		{ isThirdLargest = true;
		} 

        // Output 
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }
}