import java.util.Scanner;
class Average
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:-");
		double a=sc.nextInt();
		System.out.println("Enter second number:-");
		double b=sc.nextInt();
		System.out.println("Enter third number:-");
		double c=sc.nextInt();
		double average=(a+b+c)/3;
		System.out.println("Average of three numbers:-"+average);
	}
}
