import java.util.Scanner;
class Natural3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		int formulasum=n*(n+1)/2;
		System.out.println("sum using for loop="+sum);
		System.out.println("sum using formula="+formulasum);
		if(sum==formulasum)
		{
			System.out.println("both are results are equal");
		}
	}
}
