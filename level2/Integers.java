package com.gla.level2;
import java.util.Scanner;
public class Integers {
    public static void integer(int[] num) {

        for (int number : num) {
            if (number > 0) {

                System.out.println("num is positive");


            } else {
                System.out.println("num is negative");
            }

        }
    }

    public static void evenandodd(int[] num) {
        for (int number : num) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println("num is even");

                } else {
                    System.out.println("num is odd");
                }
            }
        }

    }
    public static void compare(int[] num){
        if (num[0]>num[4]){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
    }

    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int[] num=new int[5];
        for(int i=0;i<5;i++){
            num[i]=s1.nextInt();
        }
        integer(num);
        evenandodd(num);
        compare(num);
    }
}