import java.util.Scanner;
class Spring
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter month");
		int month=sc.nextInt();
		System.out.println("enter day");
		int day=sc.nextInt();
		if((month==3 && day>=20)||(month==4)||(month==5)||(month==6 && day<=20))
		{
			System.out.println("spring season");
		}
		else 
		{
			System.out.println("not a spring season");
		}
	}
}
 