package com.gla.Level3;
import java.util.Scanner;
public class FrequencyUsingUnique {
    public static char[] uniqueChars(String s) {    //method to fin unique characters
        char temp[] = new char[s.length()];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
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

    public static String[][] findFrequency(String s) {    //method to find frequency and store in 2D array
        int freq[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        char unique[] = uniqueChars(s);
        String result[][] = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void display(String arr[][]) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        String ans[][] = findFrequency(text);
        display(ans);
    }
}