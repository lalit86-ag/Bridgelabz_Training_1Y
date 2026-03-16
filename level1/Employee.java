package com.gla.level1;
public class Employee {
    String name;
    int id;
    double salary;

    public Employee(String n, int i, double s) {
        this.name = n;
        this.id = i;
        this.salary = s;
    }

    public void displayDetails() {
        System.out.println("Employee Name = " + name);
        System.out.println("Employee ID = " + id);
        System.out.println("Employee Salary = " + salary);
    }

    public static void main(String[] args) {
        Employee E1 = new Employee("Punarv", 50, 30000);
        Employee E2 = new Employee("Rajeev", 55, 40000);
        System.out.println("Details of Employee 1");
        E1.displayDetails();
        System.out.println("Details of Employee 2");
        E2.displayDetails();
    }
}
