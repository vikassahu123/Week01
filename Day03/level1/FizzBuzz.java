import java.util.Scanner;

public class FizzBuzz{
  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number  ");
    int number = sc.nextInt();
    String[] str = new String[number];
    
    if (number > 0) { 
      for (int i = 0; i<number; i++) { 
        if (i % 3 == 0) {
          str[i] = "Fizz";
        }
        else if (i % 5 == 0){
          str[i] = "Buzz";
        }
        else if (i % 3 == 0 && i % 5==0 ){
          str[i] = "FizzBuzz";
        }
        else {
          str[i] = Integer.toString(i);
        }
      }
    }
    else {
      System.err.println("Negatives not permitted.");
    }
    
    // Printing values.
    for (int i = 0; i <number; i++) {
      System.out.println(str[i] + " ");
    }
    
  }
}