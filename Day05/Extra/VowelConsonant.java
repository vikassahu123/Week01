import java.util.Scanner;

public class VowelConsonant{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Enter a string");
        String text = s.nextLine();

        int vowels = 0, consonants = 0;

        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Check if the character is a vowel
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } 
            // Check if the character is a consonant
            else if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                consonants++;
            }
        }

        // Display the result
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
