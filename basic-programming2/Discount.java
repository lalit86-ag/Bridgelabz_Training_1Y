import java.util.Scanner;
class Discount
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter fees:-");
		int fees=sc.nextInt();
		System.out.println("enter discount(%):-");
		int discount=sc.nextInt();
		int amount=(discount*fees)/100;
		System.out.println("discount amount:-"+amount);
		int price=fees-amount;
		System.out.println("discount price:-"+price);
	}
}

		