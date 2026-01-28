import java.util.Scanner;
class Natural2
{
	public static void main(String args[])
	{
       Scanner sc = new Scanner(System.in);
	   System.out.println("enter number");
	   int n=sc.nextInt();
	   if(n<=0)
	   {
		   System.out.println("enter a natural number");
	   }
	   else
	   {
		   int sumwhile=0;
		   int i=1;
		   while(i<=n)
		   {
			   sumwhile=sumwhile+i;
			   i++;
		   }
		   int sumformula=n*(n+1)/2;
		   System.out.println("sum using while loop ="+sumwhile);
		   System.out.println("sum using formula ="+sumformula);
		   if(sumwhile==sumformula)
		   {
			   System.out.println("both results are correct and equal");
		   }
	   }
	   }
	}
	