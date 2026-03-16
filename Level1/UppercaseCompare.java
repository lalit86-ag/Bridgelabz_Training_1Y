import java.util.Scanner;
public class UppercaseCompare {
    public static String myUpperCase(String str) {       //method to convert into uppercase using charAt()
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result = result + ch;
        }
        return result;
    }
    public static boolean compareString(String s1, String s2) {     //method to compare two strings using charAt()
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter complete text:");
        String text = sc.nextLine();
        String myResult = myUpperCase(text);
        String inbuiltResult = text.toUpperCase();
        boolean ans = compareString(myResult, inbuiltResult);

        System.out.println("User Uppercase : " + myResult);
        System.out.println("Inbuilt Uppercase : " + inbuiltResult);
        System.out.println("Both are same ? " + ans);
    }
}