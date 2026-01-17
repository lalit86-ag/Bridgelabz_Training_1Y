import java.util.Scanner;
class Converter
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the kilometer:-");
		double kilometer=sc.nextDouble();
		double miles=kilometer*1.6;
		System.out.println("convert:-"+miles);
	}
}
