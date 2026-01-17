import java.util.Scanner;
class Price
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter quantity:-");
		int quantity=sc.nextInt();
		System.out.println("enter price:-");
		int price=sc.nextInt();
		int total_price=quantity*price;
		System.out.println("enter total price:-"+total_price);
	}
}
