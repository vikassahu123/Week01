


import java.util.Scanner;

public class UniqueCharacters {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (text.charAt(count) != '\0') count++;
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    public static char[] findUniqueCharacters(String text) {
        int len = getLength(text);
        char[] unique = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == unique[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique[uniqueCount++] = text.charAt(i);
        }

        char[] result = new char[uniqueCount];
        System.arraycopy(unique, 0, result, 0, uniqueCount);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        char[] unique = findUniqueCharacters(input);
        System.out.println("Unique characters:");
        for (char c : unique) System.out.print(c + " ");
    }
}