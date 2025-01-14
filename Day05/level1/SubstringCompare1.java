import java.util.*;
public class SubstringCompare1
{
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter the string ");
        String str = s.next();
        System.out.print("enter start index ");
        int st = s.nextInt();
        System.out.print("enter end index ");
        int en = s.nextInt();

        String sub1 = getSub(str, st, en);
        String sub2 = str.substring(st, en); // use en index which is go with (endIndex-1) index;

        boolean res = compare(sub1, sub2);

        System.out.println("Substring using charAt() " + sub1);
        System.out.println("Substring using substring() " + sub2);  
        
        System.out.print("Comparison result=");
        if(res) 
        { System.out.println(" Strings are equal"); 
        } 
        else 
        {
        System.out.println(" Strings are not equal");
        }

        
    }

    public static String getSub(String str, int st, int en) {
        String sub = "";
        for (int i = st; i < en; i++) {
            sub += str.charAt(i); // Concatenate each character to the result string
        }
        return sub;
    }

    public static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}