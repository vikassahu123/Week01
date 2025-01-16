import java.util.Scanner;

public class LongestWordFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Call the method to find the longest word
        String longestWord = findLongestWord(sentence);

        // Display the result
        System.out.println("The longest word is: " + longestWord);
    }

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // Split sentence into words
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word; // Update longest word if current word is longer
            }
        }

        return longestWord;
    }
}
