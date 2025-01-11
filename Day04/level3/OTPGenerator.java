import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    public static void main(String[] args) {
        int[] otps = new int[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs");
        for (int otp : otps) {
            System.out.println(otp);
        }

        boolean isUnique = areOTPsUnique(otps);
        System.out.println("Are all OTPs unique? " + isUnique);
    }

    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000); // Generates a 6-digit number by the same formula 
    }

    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> uniqueOTPs = new HashSet<>();  // HashSet is use for storing unique ele.
        for (int otp : otps) {
            uniqueOTPs.add(otp);
        }
        return uniqueOTPs.size() == otps.length; // True if all OTPs are unique
    }
}
