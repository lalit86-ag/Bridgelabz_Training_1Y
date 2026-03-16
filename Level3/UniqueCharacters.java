package com.gla.Level3;
import java.util.Scanner;
public class UniqueCharacters {
    public static int findLength(String s) {    //method to find length without using length()
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static char[] uniqueChar(String s) {    //method to find unique characters
        int n = findLength(s);
        char temp[] = new char[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (ch == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                temp[k] = ch;
                k++;
            }
        }
        char result[] = new char[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        char ans[] = uniqueChar(text);
        System.out.println("Unique characters are:");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
