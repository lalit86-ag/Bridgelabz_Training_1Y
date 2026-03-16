package com.gla.level2;
public class Converter1 {
    public static double convertyardstofeet(double yards){
        double yards2feet = 3      ;
        double feet=yards*yards2feet;
        System.out.println(feet);
        return feet;
    }
    public static double convertfeettoyards(double feet){
        double feet2yards = 0.333333;
        double feet1=feet2yards*feet;
        System.out.println(feet1);
        return feet1;
    }
    public static double convertmeterstoinches(double meters){
        double meters2inches = 39.3701;
        double inches=meters2inches*meters;
        System.out.println(inches);
        return inches;
    }
    public static double convertinchestometers(double inches){
        double inches2meters = 0.0254;
        double meters1=inches2meters*inches;
        System.out.println(meters1);
        return meters1;
    }

    static void main(String[] args) {
        int yards=100;
        int meters=100000;
        convertyardstofeet(yards);
        convertfeettoyards(convertyardstofeet(yards));
        convertmeterstoinches(meters);
        convertinchestometers(convertmeterstoinches(meters));

    }
}