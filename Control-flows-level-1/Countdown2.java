import java.util.Scanner;
class CountDown2
{
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("enter countdown");
      int a=sc.nextInt();
      for(int i=a;i>=1;i--)
	  {
           System.out.println(i);
	  }
	  System.out.println("rocket launch");
	}
}
