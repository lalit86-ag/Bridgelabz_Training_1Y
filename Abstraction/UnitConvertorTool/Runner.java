package UnitConvertorTool;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the distance in km");
        double km=s.nextDouble();
        System.out.println("Enter the weight in kg");
        double kg= s.nextDouble();
        double[] res=Conversion.convert(km,kg);
        System.out.println("The distance in miles is : "+res[0]);
        System.out.println("The weight in pounds is : "+res[1]);
    }
}
