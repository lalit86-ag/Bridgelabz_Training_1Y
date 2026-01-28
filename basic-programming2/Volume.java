import java.util.Scanner;
class Volume
{
	public static void main(String args[])
	{
		double rKm=6378;
		double pi=3.14;
		double volumeKm=(4.0/3)*pi*rKm*rKm*rKm;
		
		double rMiles=rKm/1.6;
		double volumeMiles=(4.0/3)*pi*rMiles*rMiles*rMiles;
		
		System.out.println("the volume of earth in cubic kilometers is:-"+volumeKm);
		System.out.println("the volume of earth in cubic miles is:-"+volumeMiles);
	}
}
