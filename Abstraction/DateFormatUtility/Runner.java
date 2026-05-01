package DateFormatUtility;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the date");
        int d=s.nextInt();
        System.out.println("Enter the month");
        int m=s.nextInt();
        System.out.println("Enter the year");
        int y=s.nextInt();
        System.out.println("Enter the format that you want you want your date in (1 : d/m/y , 2 : m/d/y , 3 : y/m/d");
        int c=s.nextInt();
        DateFormat.format(d,m,y,c);
    }
}
