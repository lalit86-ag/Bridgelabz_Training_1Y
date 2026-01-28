import java.util.Scanner;
class Yards
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter distance in feet:-");
		double feet=sc.nextInt();
		double yard=3*feet;
		System.out.println("convert feet into yard:-"+yard);
		double miles=1760*yard;
		System.out.println("convert yard into miles:-"+miles);
	}
}

		