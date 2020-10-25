package JavaArrayDataTypes_Examples;

import java.util.*;

public class TC001_IntegerArray
{
    public static void main(String[] args) 
    {
        int oddArray[] = {11,21,32,41,51};   
        System.out.println("Array of odd elements:" + Arrays.toString(oddArray));
        
        int intArray[] = new int[10];
        for(int i=0;i<10;i++)
        {
        	//assign values to array
        	intArray[i] = i+1;
        }
        System.out.println("Array of Integer elements:" + Arrays.toString(intArray));
    }
}
