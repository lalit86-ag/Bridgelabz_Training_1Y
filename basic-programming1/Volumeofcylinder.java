import java.util.Scanner;
class Volumeofcylinder
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height:-");
		int height=sc.nextInt();
		System.out.println("Enter radius:-");
		int radius=sc.nextInt();
		double V=3.14*radius*radius*height*height;
		System.out.println("Volume of cylinder:-"+V);
	}
}
