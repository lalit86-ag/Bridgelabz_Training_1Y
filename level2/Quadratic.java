package com.gla.level2;
public class Quadratic {
    public static void roots(int a,int b,int c){
        double po=Math.pow(b,2);
        double delta= po+(4*a*c);
        double sq=Math.sqrt(delta);
        if(delta>0){
            double root1=(-b+sq)/(2*a);
            double root2=(-b-sq)/(2*a);
        }
        if(delta==0){
            int root= -b/(2 * a);
        }

    }

    static void main(String[] args) {
        int a=1;
        int b=3;
        int c=1;
        roots(a,b,c);
    }
}