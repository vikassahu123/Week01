public class DistanceConverter 
{ public static void main(String[]args) 
  { double distanceInKm=10.8; 
    double converFactForMile=1.6; 
	
	double distanceInMile=distanceInKm/converFactForMile; 
	
	System.out.println("The distance "+ distanceInKm + "  km in miles is " + distanceInMile); 
	} 
}