import java.util.Scanner;

public class ArrayCreation{
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Enter row ");
    int row = s.nextInt();
    System.out.print("Enter Column ");
    int column = s.nextInt();
    
    
    int matrix[][] = new int[row][column];
    System.out.println("Enter Matrix element: ");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    
   
    int size = row * column;
    int arr[] = new int[size];
    int index = 0;
    
    // Inserting the elements from the matrix into array
    for (int i = 0; i<row; i++) {
      for (int j = 0; j<column; j++) {
        arr[index++] = matrix[i][j];
      }
    }
    
    //Printing
    for (int i = 0; i<size; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}