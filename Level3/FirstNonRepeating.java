package com.gla.Level3;
import java.util.Scanner;
public class FirstNonRepeating {
    public static char findChar(String s) {    //method to find first non-repeating character
        int freq[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        for (int i = 0; i < s.length(); i++) {    //find first non-repeating
            char ch = s.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }
        return '#';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        char ans = findChar(text);
        if (ans == '#')
            System.out.println("No non-repeating character");
        else
            System.out.println("First non-repeating character is: " + ans);
    }
}
