import java.util.*;

public class WeightStatus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
		
        double weight = s.nextDouble();
        double heightCm = s.nextDouble();
        double heightM = heightCm/100; 
        double bmi = weight / (heightM * heightM);  
		
		// conditions follow 
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("StatNormal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println(" Obese");
        }

    }
}