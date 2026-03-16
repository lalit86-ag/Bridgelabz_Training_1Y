package com.gla.Level2;
import java.util.Scanner;
public class LengthOfString {
        static int findLength(String s) {    // method to find length without using length()
            int count = 0;
            try {
                while (true) {
                    s.charAt(count);
                    count++;
                }
            }
            catch (Exception e) {
                return count;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter a String: ");
            String str = sc.next();

            int len1 = findLength(str);   // use user defined method
            int len2 = str.length();      // use built-in method

            System.out.println("length without length() = " + len1);
            System.out.println("length using length() = " + len2);
        }
    }

