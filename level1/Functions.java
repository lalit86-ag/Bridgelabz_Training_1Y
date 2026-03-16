package com.gla.level1;
public class Functions {
    public static void Trigonometric(double angle){
        double radion=Math.toRadians(angle);

        double sin=Math.sin(radion);
        double cos=Math.cos(radion);
        double tan=Math.tan(radion);

        System.out.println(sin);
        System.out.println(cos);
        System.out.println(tan);
    }

    static void main(String[] args) {
        Trigonometric(45);
    }
}