public class PanDistribution
{ public static void main(String[]args) 
  { int totalPens=14; 
    int numberOfStudent=3; 
    int pensForEach=totalPens/numberOfStudent;  
	int remainingPens=totalPens%numberOfStudent;
    
    System.out.println(
            "The Pen Per Student is " + pensForEach + 
            " and the remaining pen not distributed is " + remainingPens );	
  } 
}