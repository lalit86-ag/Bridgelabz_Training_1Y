package com.gla.Level2;
import java.util.Scanner;
public class FindVowelsAndConsonants {
        static String checkChar(char ch) {     // method to check character type
            if (ch >= 65 && ch <= 90) {        // convert uppercase to lowercase using ASCII
                ch = (char)(ch + 32);
            }
            if (ch >= 'a' && ch <= 'z') {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    return "Vowel";
                else
                    return "Consonant";
            }
            return "Not a Letter";
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String:");
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String result = checkChar(ch);
                System.out.println(ch + " → " + result);
            }
        }
    }

