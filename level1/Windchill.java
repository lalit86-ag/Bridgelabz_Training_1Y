package com.gla.level1;
import java.util.Scanner;
public class Windchill {
    public void Calculator(double temp, double windspeed){
        double windchil=35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windspeed,0.16);
        System.out.println(windchil);
    }

    static void main(String[] args) {
        Windchill c1=new Windchill();
        c1.Calculator(45,20);
    }
}