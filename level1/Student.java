package com.gla.level1;
public class Student {
    String name;
    int rollNumber;
    int marks;
    public Student(String n,int r,int m){
        this.name=n;
        this.rollNumber=r;
        this.marks=m;
    }
    public void studentDetails(){
        String grade;
        if(marks>=90){
            grade="A";
        }
        else if(marks>=80 && marks<90){
            grade="B";
        }
        else if(marks>=70 && marks <80){
            grade="C";
        }
        else if(marks>=60 && marks<70){
            grade="D";
        }
        else{
            grade="F";
        }
        System.out.println("The Name of the Student is : "+name);
        System.out.println("The Roll Number of the Student is : "+rollNumber);
        System.out.println("The Grade of the Student is : "+grade);
    }
    public static void main(String[] args){
        Student s1 = new Student("Punarv",50,90);
        Student s2 = new Student("Rajeev",55,80);
        System.out.println("-----Student 1 :-----");
        s1.studentDetails();
        System.out.println("-----Student 2 :-----");
        s2.studentDetails();
    }
}
