import java.util.*; 
public class divide
{ 
  public static void main(String[]args) 
  {  Scanner s=new Scanner(System.in); 
  
     System.out.print("enter a number ");
     int number=s.nextInt(); 
	 boolean ans=false;
	 if(number%5==0) 
	 { 
       ans=true; 
	 } 
	 
	 System.out.println(" Is the number " + number +" divisible by 5? "+ ans);
     
	}
}