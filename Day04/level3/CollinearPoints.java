public class CollinearPoints {

    public static void main(String[] args) {
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        // Check using the slope formula
        boolean collinearUsingSlope = arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using slope formula: " + collinearUsingSlope);

        // Check using the area of the triangle formula
        boolean collinearUsingArea = arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using area formula: " + collinearUsingArea);
    }

    // Method to check collinearity using the slope formula
    public static boolean arePointsCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);
        
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using the area of the triangle formula
    public static boolean arePointsCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}
