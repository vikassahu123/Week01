public class SamAvgMarks 
{ public static void main(String[]args) 
  { int mathsMark=94; 
    int physicsMark=95; 
    int chemistryMark=96; 

    int	totalObtainMark=mathsMark+physicsMark+chemistryMark; 
	
	int totalMarks=300; 
	
	double samAvgMarks= (totalObtainMark/(1.0*totalMarks))*100;
	System.out.println("Sam’s average mark in PCM is" +samAvgMarks); 
	} 
}