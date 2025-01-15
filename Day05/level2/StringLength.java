import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter the string ");
        String str = s.next();

        // user-defined method
        int customLength = findLength(str);

        // built-in length() method
        int builtInLength = str.length();

        // Display results
        System.out.println("Length using user-defined method  " + customLength);
        System.out.println("Length using built-in length() method  " + builtInLength);

        
    }

    public static int findLength(String str) {
        int count = 0; 
		int index=0;
        try {
            while (true) {
                str.charAt(index); // Access characters until it throws an exception
                index++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception indicates we've reached the end of the string
        } 
		count=index;
        return count;
    }
}
