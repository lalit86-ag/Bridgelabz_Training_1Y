package com.gla.level2;
public class Factors {
    public static void factors(int num){
        int fact=1;
        int[] arr=new int[num];

        for(int i=1;i<=num;i++){
            if(num%i==0){
                arr[i-1]=i;
            }
        }
        int sum=0;
        for(int number:arr){
            sum+=number;
        }
        int pro=1;
        for(int i=1;i<=num;i++){

            pro*=i;}

        int s1=0;

        for(int number:arr){
            s1+=Math.pow(number,2);
        }


        for(int number:arr){
            System.out.print(" "+number);
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(pro);
        System.out.println(s1);

    }

    static void main(String[] args) {
        factors(10);
    }
}