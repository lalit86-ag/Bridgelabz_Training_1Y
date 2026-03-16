package com.gla.Level3;
import java.util.Scanner;
public class CharFrequency {
    public static String[][] findFrequency(String s) {    //method to find frequency and store in 2D
        int freq[] = new int[256];
        for (int i = 0; i < s.length(); i++) {      //count frequency using charAt()
            char ch = s.charAt(i);
            freq[ch]++;
        }
        int count = 0;        // count how many unique characters
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                count++;
        }
        String result[][] = new String[count][2];   // create 2D array
        int k = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[k][0] = String.valueOf((char) i);
                result[k][1] = String.valueOf(freq[i]);
                k++;
            }
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