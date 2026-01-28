import java.util.Scanner;
class Number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("a is positive");
		}
		else if(a<0)
		{
			System.out.println("a is negative");
		}
		else
		{
			System.out.println("a is zero");
		}
	}
}
