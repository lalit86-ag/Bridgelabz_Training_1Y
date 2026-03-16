package com.gla.Level2;
import java.util.Scanner;
public class SplitTheTextIntoWord3 {
        public static int findLength(String s) {     // method to find length of string without using length()
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
        public static String[] splitWords(String text) {     // method to split words without using split()
            int len = findLength(text);
            String[] temp = new String[len];   // max possible words
            int k = 0;
            String word = "";
            for (int i = 0; i < len; i++) {
                char ch = text.charAt(i);
                if (ch != ' ') {
                    word = word + ch;
                } else {
                    temp[k++] = word;
                    word = "";
                }
            }
            temp[k++] = word;
            String[] words = new String[k];
            for (int i = 0; i < k; i++) {
                words[i] = temp[i];
            }
            return words;
        }
        public static String[][] make2D(String[] words) {      // create 2D arrayof word and its length
            String[][] arr = new String[words.length][2];
            for (int i = 0; i < words.length; i++) {
                arr[i][0] = words[i];
                arr[i][1] = String.valueOf(findLength(words[i]));
            }
            return arr;
        }
        public static String[] shortLong(String[][] arr) {          // find shortest and longest word
            int min = Integer.parseInt(arr[0][1]);
            int max = min;
            String shortW = arr[0][0];
            String longW = arr[0][0];
            for (int i = 1; i < arr.length; i++) {
                int l = Integer.parseInt(arr[i][1]);
                if (l < min) {
                    min = l;
                    shortW = arr[i][0];
                }
                if (l > max) {
                    max = l;
                    longW = arr[i][0];
                }
            }
            return new String[]{shortW, longW};
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a sentence:");
            String text = sc.nextLine();

            String[] words = splitWords(text);
            String[][] arr = make2D(words);
            String[] result = shortLong(arr);

            System.out.println("Shortest Word: " + result[0]);
            System.out.println("Longest Word: " + result[1]);
        }
    }