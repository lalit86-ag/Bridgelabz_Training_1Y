package com.gla.Level1;
import java.util.Scanner;
public class CharactersInString {
    public static char[]getChars(String text)    // method to return characters without using toCharArray()
    {
        char[] arr=new char[text.length()];
        for(int i=0;i<text.length();i++)
        {
            arr[i]=text.charAt(i);
        }
        return arr;
    }
    public static boolean compareArrays(char[] a, char[] b)   // method to  compare two char arrays
    {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        char[] arr1 = getChars(text);  // use user-defined method
        char[] arr2 = text.toCharArray();  // use built-in method
        boolean result = compareArrays(arr1, arr2);  //compare both arrays
        System.out.println("both arrays are same: " + result);
    }
}

