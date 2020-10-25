package JavaArrayDataTypes_Examples;

import java.util.*;

public class TC004_BooleanArray
{
	public static void main(String args[])
	{
		//declare and allocate memory
		boolean bool_array[] = new boolean[5];
		System.out.println("Java boolean Array Example:" + Arrays.toString(bool_array));

		//assign values to first 4 elements
		bool_array[0] = true;
		bool_array[1] = false;
		bool_array[2] = true;
		bool_array[3] = false;

		//print the array
		System.out.println("Java boolean Array Example:" + Arrays.toString(bool_array));
}
}
