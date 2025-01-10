import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        
       
        System.out.print("Enter the city from: ");
        String fromCity = s.nextLine();
        
        System.out.print("Enter the city via: ");
        String viaCity = s.nextLine();
        
        System.out.print("Enter the city to: ");
        String toCity = s.nextLine();
        
        // Input distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = s.nextDouble();
        
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = s.nextDouble();
        
        // Total distance traveled
        double totalDistance = fromToVia + viaToFinalCity;
        
        // Input time taken
        System.out.print("Enter the time taken (in hours): ");
        double timeTaken = s.nextDouble();
        
        // Calculate average speed
        double averageSpeed = totalDistance / timeTaken;
        
        // Output the result
        System.out.println("Name: " + name + "Traveling from " + fromCity + " to " + viaCity + " to " + toCity+"Total distance traveled: " + totalDistance + " miles Average speed: " + averageSpeed + " miles per hour" );
        
        
  } 
}
