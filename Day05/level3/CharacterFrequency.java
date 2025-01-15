


import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the text from the user
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Find unique characters and their frequencies
        char[] uniqueChars = uniqueCharacters(text);
        String[][] frequencyArray = findFrequency(text, uniqueChars);

        // Display the result
        displayFrequency(frequencyArray);
    }

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        StringBuilder unique = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (unique.indexOf(String.valueOf(c)) == -1) {
                unique.append(c);
            }
        }
        return unique.toString().toCharArray();
    }

    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String text, char[] uniqueChars) {
        int[] frequency = new int[256];

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Create a 2D String array to store the unique characters and their frequencies
        String[][] frequencyArray = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            frequencyArray[i][0] = String.valueOf(uniqueChars[i]);
            frequencyArray[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return frequencyArray;
    }

    // Method to display the frequency of characters
    public static void displayFrequency(String[][] frequencyArray) {
        System.out.println("Character\tFrequency");
        for (String[] entry : frequencyArray) {
            System.out.println(entry[0] + "\t\t" + entry[1]);
        }
    }
}