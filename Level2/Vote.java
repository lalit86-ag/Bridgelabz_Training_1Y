package com.gla.Level2;
import java.util.Scanner;
public class Vote {
        static String checkVote(int age) {    // method to check voting eligibility
            if (age < 0)
                return "Invalid";
            else if (age >= 18)
                return "Can Vote";
            else
                return "Cannot Vote";
        }
        static String[][] makeTable(int ages[]) {    // method to create 2D array
            String arr[][] = new String[ages.length][2];
            for (int i = 0; i < ages.length; i++) {
                arr[i][0] = String.valueOf(ages[i]);
                arr[i][1] = checkVote(ages[i]);
            }
            return arr;
        }
        static void display(String arr[][]) {
            System.out.println("Age\tStatus");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i][0] + "\t" + arr[i][1]);
            }
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int age[] = new int[10];
            System.out.println("Enter age of 10 students:");
            for (int i = 0; i < 10; i++) {
                age[i] = sc.nextInt();
            }
            String table[][] = makeTable(age);
            display(table);
        }
    }

