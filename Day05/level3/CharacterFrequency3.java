


import java.util.Scanner;

public class CharacterFrequency3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the text from the user
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Find the frequency of characters in the text
        String[][] frequencyArray = findFrequency(text);

        // Display the result
        displayFrequency(frequencyArray);
    }

    // Method to find the frequency of characters in a string using charAt() method
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256]; // Array to store the frequency of characters

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequency[c]++;
        }

        // Find the number of unique characters
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store the characters and their frequencies
        String[][] frequencyArray = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                frequencyArray[index][0] = String.valueOf((char) i);
                frequencyArray[index][1] = String.valueOf(frequency[i]);
                index++;
            }
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