package com.gla.level2;
import java.util.Scanner;
public class Youngest {
    public static void age(int[] age){
        if(age[0]<age[1]&&age[0]<age[2]){
            System.out.println("1st friend is youngest ");
        }
        else if(age[1]<age[0]&&age[1]<age[2]){
            System.out.println("2nd friend is youngest ");

        }
        else {
            System.out.println("3rd friend is youngest ");

        }



    }
    public static void height(int[] height) {
        if (height[0] > height[1] && height[0] > height[2]) {
            System.out.println("1st friend is tallest ");
        } else if (height[1] > height[0] && height[1] > height[2]) {
            System.out.println("2nd friend is tallest ");

        } else {
            System.out.println("3rd friend is tallest ");
        }
    }

    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int[] age=new int[3];
        int[] height=new int[3];
        for(int i=0;i<3;i++){
            age[i]= s1.nextInt();}
        for(int i=0;i<3;i++){
            height[i]= s1.nextInt();}
        age(age);
        height(height);

    }
}