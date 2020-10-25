package JavaArrayDataTypes_Examples;

public class TC005_CharecterArray
{
    public static void main(String[] args) 
    {
    	//character array of vowels
    	char[] vowel_Array = {'a', 'e', 'i', 'o', 'u'};     
    	System.out.println(vowel_Array);
    	
        System.out.println("Character array containing vowels:");
        //print the array
        for (int i=0; i<vowel_Array.length; i++) 
        {
            System.out.print(vowel_Array[i] + " ");
        }
    }
}
