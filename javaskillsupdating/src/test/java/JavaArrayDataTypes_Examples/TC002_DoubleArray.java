package JavaArrayDataTypes_Examples;

import java.util.*;

public class TC002_DoubleArray
{
    public static void main(String[] args) 
    {
        double d_Array[] = new double[10];  
        System.out.println("Array of double elements:" + Arrays.toString(d_Array));
        //array of doubles
        for(int i=0;i<10;i++)
        {
        	//assign values to double array
            d_Array[i] = i+2.0;     
        }
        System.out.println("Array of double elements:" + Arrays.toString(d_Array));
    }
}