import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter the text ");
        String text = s.nextLine();

        //  user-defined method
        String[] userWords = splitText(text);

        // built-in split() method
        String[] builtInWords = text.split(" ");

        // Compare the results
        boolean isEqual = compareArrays(userWords, builtInWords);

        // Display results
        System.out.println("Words using user-defined method:");
        printArray(userWords);

        System.out.println("Words using split() method:");
        printArray(builtInWords);

        System.out.println("Comparison result: " + (isEqual ? "Arrays are equal" : "Arrays are not equal"));

      
    }

    // Method to split the text into words using charAt()
    public static String[] splitText(String text) {
        int wordCount = countWords(text);
        int[] spaceIndexes = new int[wordCount + 1];// extra space is use for store lenght of text in last index
        String[] words = new String[wordCount];

        // Find the indexes of spaces
        int index = 0, spaceIndex = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
            }
        }
        spaceIndexes[spaceIndex] = text.length(); 

        // Extract words using space indexes
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = spaceIndexes[i];
            words[i] = text.substring(start, end);  // use for geting only words from the given text.
            start = end + 1; // Skip the space
        }
        return words;
    }

    // Method to count words in the text
    public static int countWords(String text) {
        int count = 1; // At least one word exists
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false; //.equals() is use for character check.
        }
        return true;
    }

    // Method to print the array
    public static void printArray(String[] arr) {
        for (String word : arr) {
            System.out.println(word);
        }
    }
}
