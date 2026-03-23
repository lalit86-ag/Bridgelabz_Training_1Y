package EmployeeManagementSystem;

public class Runner {
    public static void main(String[] args) {
        Manager manager = new Manager("Lalit", 101, 100000, 100);
        Developer developer = new Developer("Rahul", 1234, 50000, "Java");
        Intern intern = new Intern("Vishal", 155, 20000, 3);
        System.out.println("----Manager Details-----");
        manager.displayDetails();
        System.out.println("-----Developer Details-----");
        developer.displayDetails();
        System.out.println("-----Intern Details-----");
        intern.displayDetails();
    }
}
