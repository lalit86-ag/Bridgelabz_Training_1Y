import java.util.Scanner;
class Natural
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		if(n>0)
		{
			int sum=n*(n+1)/2;
			System.out.println("the sum of "+n+" natural number is"+sum);
		}
		else
		{
			System.out.println("the number is not a natural number");
		}
	}
}