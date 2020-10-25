package AreaAndCircumference;
import java.util.Scanner;

public class TC_Circlecircumference 
{
	public static void main(String[] args)
	{
		double radius;
		System.out.println("Enter the radius value : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
		
		double circumference = Math.PI * 2 * radius;
		System.out.println("Area of the circle is: " + circumference);
	}

}
