import java.util.Scanner;
class Sumuntilzero1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double total=0.0;
		double num;
		System.out.println("enter number");
		num=sc.nextDouble();
		while(num!=0)
		{
			total=total+num;
			System.out.println("enter number");
			num=sc.nextDouble();
		}
		System.out.println("sum="+total);
	}
}

		