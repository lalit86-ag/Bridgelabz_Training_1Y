package com.gla.Level2;
import java.util.Scanner;
public class TrimTheLeadingAndTrailingSpace {
        static int[] findIndexes(String s) {      // method to find start and end index
            int start = 0;
            int end = s.length() - 1;
            while (start <= end && s.charAt(start) == ' ') {    // remove leading space
                start++;
            }
            while (end >= start && s.charAt(end) == ' ') {    // remove trailing space
                end--;
            }
            return new int[]{start, end};
        }
        static String makeSubstring(String s, int st, int en) {    // method to create substring using charAt()
            String result = "";
            for (int i = st; i <= en; i++) {
                result = result + s.charAt(i);
            }
            return result;
        }
        static boolean compare(String a, String b) {    // method to compare two strings
            if (a.length() != b.length())
                return false;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i))
                    return false;
            }
            return true;
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String with spaces:");
            String str = sc.nextLine();
            int pos[] = findIndexes(str);
            String myTrim = makeSubstring(str, pos[0], pos[1]);
            String realTrim = str.trim();    // built-in trim for comparison
            System.out.println("After Removing Spaces = " + myTrim);
            if (compare(myTrim, realTrim))
                System.out.println("Both strings are SAME");
            else
                System.out.println("Both strings are DIFFERENT");
        }
    }

