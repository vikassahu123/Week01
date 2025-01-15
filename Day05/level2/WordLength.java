import java.util.Scanner;

public class WordLength {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter the text ");
        String text = s.nextLine();

        // Split text into words
        String[] words = splitText(text);  // ans get always in string[] by this splitText().

        // Create 2D array of words and their lengths
        String[][] wordLengths = getWordsWithLengths(words);

        // Find shortest and longest strings
        String[] shortestAndLongest = findShortestAndLongest(wordLengths);

        // Display results
        System.out.println("\nWord\tLength");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t" + wordLength[1]);
        }

        System.out.println("\nShortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

        s.close();
    }

    // Method to split the text into words
    public static String[] splitText(String text) {
        int wordCount = countWords(text);
        int[] spaceIndexes = new int[wordCount + 1];
        String[] words = new String[wordCount];

        // Find the indexes of spaces
        int spaceIndex = 0;
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

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordLengths) {
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];
        int minLength = Integer.parseInt(wordLengths[0][1]);
        int maxLength = Integer.parseInt(wordLengths[0][1]);

        for (String[] wordLength : wordLengths) {
            int length = Integer.parseInt(wordLength[1]);
            if (length < minLength) {
                minLength = length;
                shortest = wordLength[0];    //always take only 1-d array of it.
            }
            if (length > maxLength) {
                maxLength = length;
                longest = wordLength[0];   //always take only 1-d array of it.
            }
        }

        return new String[]{shortest, longest};
    }
}
