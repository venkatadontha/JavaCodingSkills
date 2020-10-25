package AreaAndCircumference;

import java.util.Scanner;

public class TC_Squarearea 
{
	public static void main(String[] args)
	{
		double side;
		System.out.println("Enter the side value : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		side = sc.nextDouble();
		
		double area = side * side;
		System.out.println("Area of the Square is: " + area);
		
	}

}
