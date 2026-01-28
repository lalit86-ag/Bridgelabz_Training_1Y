import java.util.Scanner;
class Square
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a:-");
        int a=sc.nextInt();
		double perimeter=4*a;
		System.out.println("perimeter of square:-"+perimeter);
	}
}
