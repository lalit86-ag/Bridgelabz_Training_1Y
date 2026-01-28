import java.util.Scanner;
class Sumuntilneg
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double sum=0.0;
		while(true)
		{
			System.out.println("enter number");
			double num=sc.nextDouble();
			if(num<=0)
			{
				break;
			}
					sum+=num;
				}
				System.out.println("sum of enter numbers ="+sum);
			}
		}
		