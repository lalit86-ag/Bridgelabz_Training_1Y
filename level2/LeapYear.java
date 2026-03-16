package com.gla.level2;
public class LeapYear {
    public void year(int year){
        if(year%100!=0&&year%4==0){
            System.out.println("Leap Year");
        }
        else if(year%400==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }

    static void main(String[] args) {
        LeapYear l1=new LeapYear();
        int year=2024;
        if(year>=1582){
            l1.year(year);
        }
    }

}