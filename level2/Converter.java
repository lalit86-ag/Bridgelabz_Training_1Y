package com.gla.level2;
public class Converter {
    public static double convertKmToMiles(double km){
        double km2miles = 0.621371;
        double miles=km*km2miles;
        System.out.println(miles);
        return miles;
    }
    public static double convertmilesTokm(double miles){
        double miles2km = 1.60934;
        double km1=miles2km*miles;
        System.out.println(km1);
        return km1;
    }
    public static double convertmetersTofeet(double meters){
        double meters2feet = 3.28084;
        double feet=meters2feet*meters;
        System.out.println(feet);
        return feet;
    }
    public static double convertfeettometers(double feet){
        double feet2meters = 0.3048;
        double meters1=feet2meters*feet;
        System.out.println(meters1);
        return meters1;
    }

    static void main(String[] args) {
        int km=100;
        int meters=100000;
        convertKmToMiles(km);
        convertmilesTokm(convertKmToMiles(km));
        convertmetersTofeet(meters);
        convertfeettometers(convertmetersTofeet(meters));

    }
}