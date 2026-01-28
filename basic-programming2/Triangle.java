import java.util.Scanner;
class Triangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("enter h in cm:-");
		double h=sc.nextInt();
		System.out.println("enter b in cm:-");
		double b=sc.nextInt();
		double area_cm=b*h*0.5;
		double area_inch=area_cm/(2.54*2.54);
		System.out.println("area of triangle in cm:-"+area_cm);
        System.out.println("area of triangle in inch:-"+area_inch);
	}
}
