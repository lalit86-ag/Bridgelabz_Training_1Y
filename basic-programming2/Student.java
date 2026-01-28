import java.util.Scanner;
class Student
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total pens:-");
		int pens = sc.nextInt();
		System.out.println(" enter total number of students:-");
		int students = sc.nextInt();
		int eachstudentget =pens/students;
        double remainingPens=pens%students;
        System.out.println("each students get:-"+eachstudentget);
        System.out.println("Remaining pens:-"+remainingPens);
	}
}
	
		