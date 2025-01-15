import java.util.Scanner;

public class WordLength2DArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter the text ");
        String text = s.nextLine();

        // Split text into words
        String[] words = splitText(text);

        // Create 2D array of words and their lengths
        String[][] wordLengths = getWordsWithLengths(words);

        // Display result in tabular format
        System.out.println("\nWord\tLength");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1]));
        }

        
    }

    // Method to split the text into words
    public static String[] splitText(String text) {
        int wordCount = countWords(text);
        int[] spaceIndexes = new int[wordCount + 1];
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
            words[i] = text.substring(start, end);
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

    // Method to calculate string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string
        }
        return count;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i]; // Word
            wordLengths[i][1] = String.valueOf(findLength(words[i])); // Length as String
        }
        return wordLengths;
    }
}
