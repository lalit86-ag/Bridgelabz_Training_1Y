package com.gla.level1;
import java.util.Scanner;
public class Loops {

    public void loop(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of n natural numbers are : "+sum);
    }


    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=s1.nextInt();
        Loops l1=new Loops();
        l1.loop(num);
    }

}