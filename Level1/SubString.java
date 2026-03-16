package com.gla.Level1;
import java.util.Scanner;
public class SubString {
    public static String createSubstring(String str, int start, int end) // method to create substring using charAt()
    {
        String result = " ";
        for (int i = start; i < end; i++)
        {
            result = result + str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String a, String b)  // method to compare two strings using charAt()
    {
        if (a.length() != b.length())
        {
            return false;
        }
        for (int i = 0; i < a.length(); i++)
        {
            if (a.charAt(i) != b.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String text=sc.next();
        System.out.println("enter start");
        int start=sc.nextInt();
        System.out.println("enter end");
        int end=sc.nextInt();

        String sub1=createSubstring(text,start,end);    // substring using charAt()
        String sub2=text.substring(start,end);          // substring using built-in method

        System.out.println("substring using chrAt(): " +sub1);
        System.out.println("substring using built-in method: " +sub2);

        boolean result = compareStrings(sub1,sub2);     // compare both substrings
        System.out.println("both are same: " +result);
    }
}
