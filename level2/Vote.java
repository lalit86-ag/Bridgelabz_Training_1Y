package com.gla.level2;
import java.util.Scanner;
public class Vote {
    public void eligibilty(int[] age){
        for(int number:age){
            if (number>=18){
                System.out.println(true);            }
            else{
                System.out.println(false);            }

        }
        System.out.println(true);

    }

    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int[] age=new int[10];
        for(int i=0;i<10;i++){
            age[i]= s1.nextInt();
        }
        Vote v1=new Vote();
        v1.eligibilty(age);
    }

}