package com.gla.Level2;
import java.util.Scanner;
public class SplitTheTextIntoWord2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a sentence: ");
            String str = sc.nextLine();

            String words[] = new String[20];
            int count = 0;
            String w = "";
            for (int i = 0; i < str.length(); i++) {    // split words using charAt()
                if (str.charAt(i) != ' ') {
                    w = w + str.charAt(i);
                } else {
                    words[count] = w;
                    count++;
                    w = "";
                }
            }
            words[count] = w;
            count++;

            String arr[][] = new String[count][2];        //2D array for word and length
            for (int i = 0; i < count; i++) {
                arr[i][0] = words[i];
                arr[i][1] = String.valueOf(words[i].length());
            }
            System.out.println("Word  Length");
            for (int i = 0; i < count; i++) {
                System.out.println(arr[i][0] + "   " + arr[i][1]);
            }
        }
    }

