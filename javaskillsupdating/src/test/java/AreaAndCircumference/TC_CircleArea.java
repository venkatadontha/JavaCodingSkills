package AreaAndCircumference;
import java.util.Scanner;

public class TC_CircleArea 
{
	public static void main(String[] args)
	{
		double radius;
		System.out.println("Enter the radius value : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
		
		double area = Math.PI * radius * radius;
		System.out.println("Area of the circle is: " + area);
	}

}
