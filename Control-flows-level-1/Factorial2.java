import java.util.Scanner;
class Factorial2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int fact=1;
		if(n<0)
		{
			System.out.println("not factorial number");
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println("factorial="+fact);
		}
	}
}
