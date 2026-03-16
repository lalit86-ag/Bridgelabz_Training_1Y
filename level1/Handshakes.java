package com.gla.level1;
import java.util.Scanner;
public class Handshakes {

    public void calculator(int n){
        int handshake=(n*(n-1))/2;
        System.out.println("Total number of handshakes are "+handshake);

    }
    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter Number of people : ");
        int num=s1.nextInt();
        Handshakes c1=new Handshakes();
        c1.calculator(num);
    }
}