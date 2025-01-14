import java.util.*;
public class CharArrayMethod
{
 public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

        System.out.print("Enter string ");
        String str1 = s.next();

      char[] ans1 = toCharArray(str1);
        char[] ans2 = str1.toCharArray();
		
        boolean res = compare(ans1, ans2);

        System.out.print("character array using method ");
        printArray(ans1);
        System.out.print("character array using toCharArray() "); 
        printArray(ans2);  
        
        System.out.print("Comparison result=");
        if(res) 
        { System.out.println(" Strings are equal"); 
        } 
        else 
        {
        System.out.println(" Strings are not equal");
        }

        
    }

    public static char[] toCharArray(String str) {
         char []cha=new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
           cha[i]=str.charAt(i); 
		   
        }
        return cha;
    }

    public static boolean compare(char s1[], char s2[]) {
        if (s1.length != s2.length) return false;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i]) return false;
        }
        return true;
    } 
    
    public static void printArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}