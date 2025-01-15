import java.util.Scanner;

public class TrimString {

    // Method to find the start and end indexes by trimming leading and trailing spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        // Trim leading spaces
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = s.nextLine();

        // Find trim indexes
        int[] indexes = findTrimIndexes(text);
        int start = indexes[0];
        int end = indexes[1];

        //   user-defined methods
        String trimmedUserMethod = createSubstring(text, start, end);

        // built-in trim()
        String trimmedBuiltIn = text.trim();

        
        boolean isEqual = compareStrings(trimmedUserMethod, trimmedBuiltIn);

        // Display results
        System.out.println("Trimmed using user-defined method: \"" + trimmedUserMethod + "\"");
        System.out.println("Trimmed using built-in method: \"" + trimmedBuiltIn + "\"");
        System.out.println("Are the results the same? " + isEqual);

        
    }
}
