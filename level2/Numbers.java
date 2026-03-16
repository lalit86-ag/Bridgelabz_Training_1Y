package com.gla.level2;
public class Numbers {

    public static double MinMax(double[] numbers){


        double max=numbers[0];
        double min=numbers[0];
        double sum=0;
        for(double number:numbers){
            if(number>max){
                max=number;

            }
            if(number<min){
                min=number;
            }
            sum+=number;
        }
        double average=sum/4;
        return max;






    }

    static void main(String[] args) {
        System.out.println("hi");
    }

}
