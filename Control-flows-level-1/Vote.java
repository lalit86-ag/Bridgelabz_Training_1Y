import java.util.Scanner;
class Vote
{
   public static void main(String args[])
   {
Scanner sc = new Scanner(System.in);
System.out.println("enter num");
int a=sc.nextInt();
if(a>=18)
{
System.out.println("eligible");
}
else
{
System.out.println("not eligible");
}
   }
}
   