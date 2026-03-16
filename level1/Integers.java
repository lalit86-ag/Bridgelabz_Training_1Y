package com.gla.level1;
import java.util.Scanner;
public class Integers {

    public int Integer(int n){
        if(n>0){
            System.out.println("1");
        }
        else if(n<0){
            System.out.println("-1");
        }
        else{
            System.out.println("0");
        }
        return 0;
    }

    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        Integers i1=new Integers();
        System.out.println("Enter the number :");
        int num=s1.nextInt();
        i1.Integer(num);
    }
}