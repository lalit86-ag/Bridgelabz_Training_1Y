package com.gla.level1;
public class Circle {
    double radius;
    public Circle(double r){
        this.radius=r;
    }
    public void displayAreaAndCircumference(){
        double area=Math.PI*radius*radius;
        double circumference=2*radius*Math.PI;
        System.out.println("The Area of the circle is : "+area);
        System.out.println("The Circumference of the circle is : "+circumference);
    }
    public static void main(String[] args){
        Circle C1 = new Circle(5);
        Circle C2 = new Circle(7);
        System.out.println("For Circle 1 :");
        C1.displayAreaAndCircumference();
        System.out.println("For Circle 2 :");
        C2.displayAreaAndCircumference();
    }
}
