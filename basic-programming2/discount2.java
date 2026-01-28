import java.util.Scanner;
class Discount2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student fees:-");
		int studentfees=sc.nextInt();
		System.out.println("enter university discount(%):-");
		int universitydiscount=sc.nextInt();
		int Amount=(universitydiscount*studentfees)/100;
		System.out.println("universitydiscount amount:-"+Amount);
		int price=studentfees-Amount;
		System.out.println("universitydiscount price:-"+price);
	}
}
