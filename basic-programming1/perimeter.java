import java.util.Scanner;
class perimeter
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("length:-");
		int length=sc.nextInt();
		System.out.println("breadth:-");
		int breadth=sc.nextInt();
		int perimeter=2*(length+breadth);
		System.out.println("find Perimeter:-"+perimeter);
	}
}

