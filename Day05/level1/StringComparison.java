import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first string ");
        String str1 = s.next();
        System.out.print("Enter second string ");
        String str2 = s.next();

        boolean resultBycharAt = compareUsingCharAt(str1, str2);
        boolean resultByequal = str1.equals(str2); // compare by values.

        System.out.println("Comparison using charAt() " + resultBycharAt);
        System.out.println("Comparison using equals() " + resultByequal);

        System.out.println(resultBycharAt == resultByequal ? "Results match!" : "Results do not match");
       
    }

    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }
}
