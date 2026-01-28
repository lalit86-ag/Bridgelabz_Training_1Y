import java.util.Scanner;
class Profit
{
	 public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter CP:-");
		 int CP=sc.nextInt();
		 System.out.println("enter SP:-");
		 int SP=sc.nextInt();
		 int Profit=SP-CP;
		 System.out.println("find Profit:-"+Profit);
		 double Profit_percentage=(Profit*100)/CP;
		 System.out.println("find Profit percentage:-"+Profit_percentage);
	 }
}
