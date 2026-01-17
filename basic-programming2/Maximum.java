import java.util.Scanner;
class Maximum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n:-");
		int n=sc.nextInt();
		int total_handshakes=(n*(n-1))/2;
		System.out.println("possible no of handshakes:-"+total_handshakes);
	}
}
	