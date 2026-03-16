package com.gla.Level1;
import java.util.Scanner;
public class CompareString {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String s1=sc.next();
        System.out.println("enter second string");
        String s2=sc.next();
        boolean same=true;
        if(s1.length() != s2.length())
        {
            same=false;
        }
        else
        {
            for (int i = 0; i < s1.length(); i++)
            {
                if(s1.charAt(i) != s2.charAt(i))
                {
                    same=false;
                    break;
                }
            }
        }
        System.out.println("result using charAt(): " +same);
        System.out.println("result using equals(): "+s1.equals(s2));
    }
}
