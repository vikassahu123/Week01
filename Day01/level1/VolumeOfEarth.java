public class VolumeOfEarth {  
    public static void main(String[] args) {
        // Radius of the Earth in kilometers
        double radiusKm = 6378;  

        // Pi constant
        double pi = 3.14159265359;  

        // Calculate the volume of the Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);  

        // Convert the radius to miles (1 kilometer = 0.621371 miles)
        double radiusMiles = radiusKm * 0.621371;  

        // Calculate the volume of the Earth in cubic miles
        double volumeMiles3 = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);  

        // Print the results
        System.out.println(
            "The volume of Earth in cubic kilometers is " + volumeKm3 + 
            " and cubic miles is " + volumeMiles3
        );	
    } 
}