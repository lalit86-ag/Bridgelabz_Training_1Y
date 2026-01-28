import java.util.Scanner;
class Countdown1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter countdown");
		int a=sc.nextInt();
		while(a>=1)
		{
			System.out.println(a);
			a--;
		}
		System.out.println("Rocket launch");
	}
}
