package AreaAndCircumference;
import java.util.Scanner;

public class TC_Rectanglearea 
{
	public static void main(String[] args)
	{
		double width, height;
		System.out.println("Enter the width value: ");
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
				width = sc1.nextDouble();
		System.out.println("Enter the height value: ");
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
				height = sc2.nextDouble();
				
				double area = width * height;
				System.out.println("Area of rectangle is : " + area);
	}

}
