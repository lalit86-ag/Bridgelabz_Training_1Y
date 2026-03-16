package com.gla.Level2;
import java.util.Scanner;
public class CheckAndCountVowelsAndConsonants {
        static int checkChar(char ch) {    // method to check vowel/consonants/not letter
            if (ch >= 65 && ch <= 90) {       //convert uppercase to lowercase using ASCII
                ch = (char)(ch + 32);
            }
            if (ch >= 'a' && ch <= 'z') {

                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    return 1;   // vowel
                else
                    return 2;   // consonant
            }
            return 0;           // not letter
        }
        static void countVC(String str) {      //method to count vowels and consonants
            int v = 0, c = 0;
            for (int i = 0; i < str.length(); i++) {
                int res = checkChar(str.charAt(i));
                if (res == 1)
                    v++;
                else if (res == 2)
                    c++;
            }
            System.out.println("Vowels = " + v);
            System.out.println("Consonants = " + c);
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String:");
            String s = sc.nextLine();
            countVC(s);
        }
    }

