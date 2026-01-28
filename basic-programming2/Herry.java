import java.util.Scanner;
class Herry
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter birth year:-");
		int a=sc.nextInt();
		System.out.println("enter current year:-");
        int b=sc.nextInt();	
        int Age=b-a;		
	    System.out.println("Age of Herry:-"+Age);
	}
}
