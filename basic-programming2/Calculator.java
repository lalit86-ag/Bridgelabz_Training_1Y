import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a:-");
		int a=sc.nextInt();
		System.out.println("enter value of b:-");
		int b=sc.nextInt();
		int addition=a+b;
		int subtraction=a-b;
		int multiplication=a*b;
		float division=a/b;
		System.out.println("addition:-"+addition);
		System.out.println("subtraction:-"+subtraction);
		System.out.println("multiplication:-"+multiplication);
		System.out.println("division:-"+division);
	}
}

		