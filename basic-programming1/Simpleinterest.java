import java.util.Scanner;
class Simpleinterst
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal:-");
		int principal=sc.nextInt();
		System.out.println("Enter rate:-");
		int rate=sc.nextInt();
		System.out.println("Enter time:-");
		int time=sc.nextInt();
		int Simpleinterst=(principal*rate*time)/100;
		System.out.println("find the simple interest :-"+Simpleinterst);
	}
}

		