import java.util.Scanner;
class Sam
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("enter maths no:-");
        int a=sc.nextInt();
        System.out.println("enter physics no:-");
        int b=sc.nextInt();
        System.out.println("enter chem no:-");
        int c=sc.nextInt();
        double avg=(a+b+c)/3;
        System.out.println("average:-"+avg);
	}
}
	