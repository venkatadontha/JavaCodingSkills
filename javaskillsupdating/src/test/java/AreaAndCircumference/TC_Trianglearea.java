package AreaAndCircumference;
import java.util.Scanner;

public class TC_Trianglearea 
{
	public static void main(String[] args) 
	{
		double base, height;
		System.out.println("Enter the base value: ");
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		base = sc1.nextDouble();
		
		System.out.println("Enter the height value: ");
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		height = sc2.nextDouble();
		
		double area =  (base * height)/2;
		System.out.println("Are of the Triangle is: " + area);

	}

}
